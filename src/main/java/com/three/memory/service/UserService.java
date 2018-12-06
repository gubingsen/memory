package com.three.memory.service;

import com.three.memory.domain.User;

public interface UserService {

    User selectByUsername(String username);
}
