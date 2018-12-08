package com.three.memory.service.impl;

import com.three.memory.constant.SystemCon;
import com.three.memory.domain.BabyMedia;
import com.three.memory.mapper.BabyMediaMapper;
import com.three.memory.service.BabyMediaService;
import com.three.memory.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @BelongsProject: memory
 * @BelongsPackage: com.three.memory.service.impl
 * @Author: Administrator
 * @Description: 宝宝相册逻辑实现层
 */
@Service
public class BabyMediaServiceImpl implements BabyMediaService {

    @Autowired
    private BabyMediaMapper babyMediaMapper;

    @Override
    public PageVo<BabyMedia> select(Integer page, Integer babyid) {
        List<BabyMedia> list = babyMediaMapper.select(page, babyid);
        System.out.println("------------->" + list.get(0).getCreatetime());
        if (list != null) {
            return PageVo.createPage(SystemCon.ROK,"查询成功",list,list.size());

        }else {
            return PageVo.Error(SystemCon.RERROR1,"查询失败");
        }

    }
}
