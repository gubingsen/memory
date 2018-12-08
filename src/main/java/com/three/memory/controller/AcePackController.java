package com.three.memory.controller;

import com.three.memory.service.AcePackService;
import com.three.memory.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ace")
public class AcePackController {
    @Autowired
    private AcePackService service;

    @GetMapping("/selectAceAll.do")
    @ResponseBody
    public ResultBean selectAll() {
        return service.selectAll();
    }
}
