package com.picpay_simple.picpaysimple.dtos;

import com.picpay_simple.picpaysimple.domain.user.UserType;

import java.math.BigDecimal;

public record UserDTO(String firstName, String lastName, String document, BigDecimal balance, String email, String password, UserType userType) {
}
