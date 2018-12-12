package com.three.memory.service.impl;

import com.github.pagehelper.PageInfo;
import com.three.memory.domain.AcePack;
import com.three.memory.domain.AcePackLogs;
import com.three.memory.mapper.AcePackLogsMapper;
import com.three.memory.mapper.AcePackMapper;
import com.three.memory.service.AcePackService;
import com.three.memory.token.Token;
import com.three.memory.token.TokenUtil;
import com.three.memory.util.ResultUtil;
import com.three.memory.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class AcePackServiceImpl implements AcePackService {
    @Autowired
    private AcePackMapper mapper;
    @Autowired
    private AcePackLogsMapper logsMapper;

    @Override
    public ResultBean selectAll(String token,Integer pageNum,Integer pageSize) {
        List<AcePack> list = mapper.selectAll();
        PageInfo<AcePack> info = new PageInfo<>(list);

        return ResultUtil.setPage(token,null,"查询所有锦囊",info.getList(),info.getTotal(),info.getPages(),info.getPageNum(),info.getPageSize());
    }

    @Override
    public ResultBean selectAceById(String token, Integer aceid) {
        Token t = TokenUtil.parseToken(token);
        SimpleDateFormat df = new SimpleDateFormat("yy-MM-dd HH:mm:ss");

        AcePack acePack = mapper.selectByPrimaryKey(aceid);
        int i = logsMapper.selectCount(t.getId(), aceid);

        if (i == 0) {
            mapper.updateNumber(aceid);
        }

        AcePackLogs acePackLogs = new AcePackLogs(t.getId(),aceid,df.format(new Date()));
        logsMapper.insert(acePackLogs);

        return ResultUtil.setOKToken(token,acePack,"根据锦囊id查询锦囊的详细信息");
    }
}
