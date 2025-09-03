package com.picpaychallenger.services;

import com.picpaychallenger.domain.user.User;
import com.picpaychallenger.domain.user.UserType;
import com.picpaychallenger.dtos.UserDTO;
import com.picpaychallenger.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public void validateTransaction(User sender, BigDecimal amount) throws Exception{

        if(sender.getUserType() == UserType.MERCHANT){

            throw new Exception("Merchant no sending money, just receiver");
        }

        if(sender.getBalance().compareTo(amount) <= 0){
            throw new Exception("Your balance is null");
        }

    }


    public User findUserById(Long id) throws Exception {
        return this.repository.findUserById(id).orElseThrow(() -> new Exception("User not found"));
    }

    public User createUser(UserDTO data){
        User newUser = new User(data);
        this.saveUser(newUser);
        return newUser;
    }

    public List<User> getAllUsers(){
        return this.repository.findAll();
    }

    public void saveUser(User user){
        this.repository.save(user);
    }
}
