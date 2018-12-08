package com.three.memory.service.impl;

import com.three.memory.service.LifeService;
import com.three.memory.vo.ResultBean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LifeServiceImpl implements LifeService {
    @Override
    public ResultBean getUserAll() {
        return null;
    }
}
