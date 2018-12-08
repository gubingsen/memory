package com.three.memory.service.impl;

import com.three.memory.constant.SystemCon;
import com.three.memory.domain.UserBaby;
import com.three.memory.mapper.UserBabyMapper;
import com.three.memory.service.UserBabyService;
import com.three.memory.util.AliyunOSSUtil;
import com.three.memory.vo.PageVo;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @BelongsProject: memory
 * @BelongsPackage: com.three.memory.service.impl
 * @Author: Administrator
 * @Description: 用户宝宝逻辑实现层
 */
@Service
public class UserBabyServiceImpl implements UserBabyService {

    @Autowired
    private UserBabyMapper userBabyMapper;

    private final org.slf4j.Logger logger = LoggerFactory.getLogger(getClass());


    @Override
    public PageVo<UserBaby> selectOne(Integer uid) {
        return PageVo.create(SystemCon.ROK,"查询成功",userBabyMapper.select(uid));
    }

    @Override
    public PageVo update(UserBaby userBaby) {
        return userBabyMapper.insert(userBaby)?PageVo.Ok(SystemCon.ROK,"修改宝宝成功"):PageVo.Error(SystemCon.RERROR1,"修改宝宝失败");
    }

    @Override
    public PageVo delete(Integer id) {
        return userBabyMapper.delete(id)?PageVo.Ok(SystemCon.ROK,"删除宝宝成功"):PageVo.Error(SystemCon.RERROR1,"删除宝宝失败");
    }

    @Override
    public PageVo insert(UserBaby userBaby, MultipartFile file) throws IOException {
        if (!file.isEmpty()) {
                //上传文件到阿里云OSS
                userBaby.setBabymedia(AliyunOSSUtil.upload(file));
                //保存到本地数据库
                userBabyMapper.insert(userBaby);
                //返回
                return PageVo.Ok(SystemCon.ROK, "新增宝宝成功");


        } else {
            return PageVo.Error(SystemCon.RERROR1, "请选择上传文件");
        }

    }

}
