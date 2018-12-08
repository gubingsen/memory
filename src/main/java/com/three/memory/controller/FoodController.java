package com.three.memory.controller;

import com.three.memory.service.FoodService;
import com.three.memory.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fod")
public class FoodController {
    @Autowired
    private FoodService service;

    @GetMapping("/selectFoodAll.do")
    @ResponseBody
    public ResultBean selectFoodAll() {
        return service.selectFoodAll();
    }

    @GetMapping("/selectFtpAll.do")
    @ResponseBody
    public ResultBean selectFtpAll() {
        return service.selectFtpAll();
    }

    @GetMapping("/selectByFtyId.do")
    @ResponseBody
    public ResultBean selectByFtyId(int ftyid) {
        return service.selectByFtyId(ftyid);
    }

    @GetMapping("/selectByFodId.do")
    @ResponseBody
    public ResultBean selectByFodId(int fodid) {
        return service.selectByFodId(fodid);
    }

    @GetMapping("/selectByUsrId.do")
    @ResponseBody
    public ResultBean selectByUsrId(int usrid) {
        return service.selectByUsrId(usrid);
    }


}
