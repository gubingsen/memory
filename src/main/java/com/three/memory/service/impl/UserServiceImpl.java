package com.three.memory.service.impl;

import com.three.memory.domain.User;
import com.three.memory.mapper.UserMapper;
import com.three.memory.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper mapper;

    @Override
    public User selectByUsername(String username) {
        return mapper.selectByUsername(username);
    }
}
