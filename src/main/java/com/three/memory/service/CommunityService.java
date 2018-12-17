package com.three.memory.service;

import com.three.memory.vo.ResultBean;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface CommunityService {

    /**
     * 获取所有社区信息
     * @param token
     * @return
     */
    ResultBean getCommunityAll(String token);

    /**
     * 根据社区id查询用户动态信息
     * @param token
     * @param cid
     * @param pageNum
     * @param pageSize
     * @return
     */
    ResultBean getCommunityByCidPage(String token, Integer pageNum, Integer pageSize, Integer cid);

    /**
     * 上传文件
     * @param file
     * @return
     * @throws IOException
     */
    ResultBean uploadfile(MultipartFile file) throws IOException;
}
