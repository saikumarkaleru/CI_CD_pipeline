package com.ecommerce.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.ecommerce.model.User;
import com.ecommerce.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
