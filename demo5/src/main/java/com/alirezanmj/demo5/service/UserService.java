package com.alirezanmj.demo5.service;

import com.alirezanmj.demo5.model.User;
import com.alirezanmj.demo5.web.dto.UserRegistrationDto;

public interface UserService {
    User save(UserRegistrationDto registrationDto);

}
