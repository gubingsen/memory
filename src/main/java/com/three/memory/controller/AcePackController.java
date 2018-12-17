package com.three.memory.controller;

import com.three.memory.service.AcePackService;
import com.three.memory.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ace")
public class AcePackController {
    @Autowired
    private AcePackService service;

    /**
     * 查询所有锦囊
     * @param token 用户的token
     * @param pageNum 当前的页数
     * @param pageSize 一页总共有多少条数据
     * @return
     */
    @PostMapping("/selectAceAll.do")
    @ResponseBody
    public ResultBean selectAll(String token,Integer pageNum,Integer pageSize) {
        return service.selectAll(token, pageNum, pageSize);
    }

    /**
     * 根据锦囊id查询锦囊的详细信息
     * @param token
     * @param aceid
     * @return
     */
    @PostMapping("/selectAceById.do")
    @ResponseBody
    public ResultBean selectAceById(String token,Integer aceid) {
        return service.selectAceById(token, aceid);
    }
}
