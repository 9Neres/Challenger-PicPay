package com.picpaychallenger.repositories;

import com.picpaychallenger.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findUserByDocument(String document); // procura se tiver ou não o user

    Optional<User> findUserById(Long id);
}
