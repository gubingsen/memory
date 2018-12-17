package com.three.memory.mapper;

import com.three.memory.domain.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 根据用户名查询用户是否存在
     * @param username
     * @return
     */
    User selectByUsername(String username);

    /**
     * 根据用户信息查询用户，这里是使用用户密码和用户名查询
     * @param user
     * @return
     */
    User selectByUser(User user);

    /**
     * 获取当前登录用户未关注的用户列表
     * @return
     */
    List<User> selectToConcern(Integer id);
}