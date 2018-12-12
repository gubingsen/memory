package com.three.memory.mapper;

import com.three.memory.domain.UserBaby;

import java.util.List;

/**
 * 用户宝宝类
 */
public interface UserBabyMapper {
    //新增宝宝信息
    boolean insert(UserBaby userBaby);
    //查询单个宝宝详情
    UserBaby select(Integer uid);
    //修改宝宝信息
    boolean update(UserBaby userBaby);
    //用户删除宝宝信息
    boolean delete(Integer id);
    //根据用户id查询宝宝的详细信息
    List<UserBaby> selectByUid(Integer uid);



}