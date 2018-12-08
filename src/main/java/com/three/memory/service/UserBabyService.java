package com.three.memory.service;

import com.three.memory.domain.UserBaby;
import com.three.memory.vo.PageVo;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface UserBabyService {

    /**
     * 查询单个宝宝详情
     * @param uid 根据用户编号
     * @return 实体类
     */
    PageVo<UserBaby> selectOne(Integer uid);

    /**
     * 修改宝宝信息
     * @param userBaby 实体类
     * @return
     */
    PageVo update(UserBaby userBaby);


    /**
     * 用户删除宝宝信息
     * @param id 宝宝编号
     * @return
     */
    PageVo delete(Integer id);

    /**
     * 新增宝宝信息
     * @param userBaby 实体类
     * @return
     */
    PageVo insert(UserBaby userBaby, MultipartFile multipartFile) throws IOException;
}
