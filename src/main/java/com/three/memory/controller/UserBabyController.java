package com.three.memory.controller;

import com.three.memory.domain.UserBaby;
import com.three.memory.service.UserBabyService;
import com.three.memory.vo.PageVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @BelongsProject: memory
 * @BelongsPackage: com.three.memory.controller
 * @Author: Administrator
 * @Description: 用户宝宝业务控制层
 */
@RestController
@RequestMapping("/userBaby")
public class UserBabyController {

    @Autowired
    private UserBabyService userBabyService;

    /**
     * 获取用户的宝宝基本信息
     * @param uid 用户id
     * @return
     */
    @GetMapping("/selectOne.do")
    public PageVo<UserBaby> selectOne(int uid) {
        return userBabyService.selectOne(uid);
    }

    /**
     * 新增宝宝信息
     * @param userBaby 实体类
     * @return
     */
    @PostMapping("/insert.do")
    public PageVo insert(UserBaby userBaby,@Param("file") MultipartFile file) throws IOException {
        return userBabyService.insert(userBaby,file);
    }

    /**
     * 删除宝宝
     * @param id 宝宝id
     * @return
     */
    public PageVo delete(int id) {
        return userBabyService.delete(id);
    }

    /**
     * 修改宝宝
     * @param userBaby 实体类
     * @return
     */
    public PageVo update(UserBaby userBaby) {
        return userBabyService.update(userBaby);
    }

}
