package com.three.memory.mapper;

import com.three.memory.domain.UserBaby;

/**
 * 用户宝宝类
 */
public interface UserBabyMapper {

    /**
     * 新增宝宝信息
     * @param userBaby 实体类
     * @return
     */
    boolean insert(UserBaby userBaby);



    /**
     * 查询单个宝宝详情
     * @param uid 根据用户编号
     * @return 实体类
     */
    UserBaby select(Integer uid);

    /**
     * 修改宝宝信息
     * @param userBaby 实体类
     * @return
     */
    boolean update(UserBaby userBaby);


    /**
     * 用户删除宝宝信息
     * @param id 宝宝编号
     * @return
     */
    boolean delete(Integer id);
}