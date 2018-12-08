package com.three.memory.service.impl;

import com.three.memory.mapper.AcePackMapper;
import com.three.memory.service.AcePackService;
import com.three.memory.util.ResultUtil;
import com.three.memory.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AcePackServiceImpl implements AcePackService {
    @Autowired
    private AcePackMapper mapper;

    @Override
    public ResultBean selectAll() {
        ResultBean resultBean = ResultUtil.setOK("查询所有锦囊",mapper.selectAll());

        return resultBean;
    }
}
