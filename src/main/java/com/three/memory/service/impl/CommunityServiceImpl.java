package com.three.memory.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.three.memory.domain.UserInfo;
import com.three.memory.mapper.CommunityMapper;
import com.three.memory.mapper.UserInfoMapper;
import com.three.memory.service.CommunityService;
import com.three.memory.util.ResultUtil;
import com.three.memory.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
@Transactional
public class CommunityServiceImpl implements CommunityService {

    @Autowired
    private CommunityMapper mapper;

    @Autowired
    private UserInfoMapper infoMapper;

    @Override
    public ResultBean getCommunityAll(String token) {
        return ResultUtil.setOKToken(token, mapper.selectAll(), "ok");
    }

    @Override
    public ResultBean getCommunityByCidPage(String token, Integer pageNum, Integer pageSize, Integer cid) {
        List<UserInfo> list = infoMapper.selectByCid(cid);
        PageInfo<UserInfo> info = new PageInfo<UserInfo>(list);
        return ResultUtil.setPage(token, null, "ok", info.getList(), info.getTotal(), info.getPages(), info.getPageNum(), info.getPageSize());
    }

    @Override
    public ResultBean uploadfile(MultipartFile file) throws IOException {
        String num = Math.random() + "";
        String filename = System.currentTimeMillis() + (num.replace(".", "")) + "-" + file.getOriginalFilename();
        File f = new File("D:\\Aserver\\photo/" + filename);
        file.transferTo(f);
        return ResultUtil.setOK("", null);
    }

}
