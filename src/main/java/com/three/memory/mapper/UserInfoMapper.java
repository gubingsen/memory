package com.three.memory.mapper;

import com.three.memory.domain.UserInfo;

import java.util.List;

public interface UserInfoMapper {

    /**
     * 当前用户关注用户的社区动态
     * @param uid
     * @return
     */
    List<UserInfo> select(Integer uid);

    /**
     * 根据社区id查询用户动态信息
     * @param uid
     * @return
     */
    List<UserInfo> selectByCid(Integer uid);
}
