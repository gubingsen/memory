package com.three.memory.service;

import com.three.memory.vo.ResultBean;

public interface AcePackService {
    //查询所有锦囊
    ResultBean selectAll(String token,Integer pageNum,Integer pageSize);
    //根据锦囊id查询锦囊的详细信息
    ResultBean selectAceById(String token,Integer aceid);
}
