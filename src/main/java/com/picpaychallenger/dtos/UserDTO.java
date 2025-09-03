package com.picpaychallenger.dtos;

import com.picpaychallenger.domain.user.UserType;

import java.math.BigDecimal;

public record UserDTO (String firstName, String LastName, String Document, BigDecimal balance, String email, String password, UserType userType){
}
