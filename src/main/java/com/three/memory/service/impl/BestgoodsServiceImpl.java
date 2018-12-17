package com.three.memory.service.impl;

import com.github.pagehelper.PageInfo;
import com.three.memory.constant.SystemCon;
import com.three.memory.domain.ProMainImg;
import com.three.memory.domain.ProType;
import com.three.memory.domain.ProductInfo;
import com.three.memory.mapper.ProDuctMapper;
import com.three.memory.mapper.ProMainImgMapper;
import com.three.memory.mapper.ProTypeMapper;
import com.three.memory.service.BestgoodsService;
import com.three.memory.util.ResultUtil;
import com.three.memory.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.Random;

@Service
@Transactional
public class BestgoodsServiceImpl implements BestgoodsService {
    @Autowired
    private ProMainImgMapper imgMapper;
    @Autowired
    private ProTypeMapper typeMapper;
    @Autowired
    private ProDuctMapper ductMapper;

    @Override
    public ResultBean selectImg(String token) {
        List<Integer> ids = imgMapper.selectAllId();
        int index = new Random().nextInt(ids.size());
        Integer id = ids.get(index);
        ProMainImg mainImg = imgMapper.selectByPrimaryKey(id);

        return ResultUtil.setOKToken(token, mainImg, "ok");
    }

    @Override
    public ResultBean selectByLevelPage(String token, Integer pageNum, Integer pageSize, Integer level) {
        if (level == null) {
            level = 1;
        }
        List<ProType> types = typeMapper.selectByLevel(level);
        PageInfo<ProType> info = new PageInfo<ProType>(types);
        return ResultUtil.setPage(token, null, "ok", info.getList(), info.getTotal(), info.getPages(), info.getPageNum(), info.getPageSize());
    }

    @Override
    public ResultBean selectProductPage(String token, Integer pageNum, Integer pageSize, Integer tid) {
        if (tid == null) {
            tid = 1;
        }
        List<Map<String, Object>> maps = ductMapper.selectProduct(tid);
        PageInfo<Map<String, Object>> info = new PageInfo<>(maps);
        return ResultUtil.setPage(token, null, "ok", info.getList(), info.getTotal(), info.getPages(), info.getPageNum(), info.getPageSize());

    }

    @Override
    public ResultBean selectdetailPage(String token, Integer pageNum, Integer pageSize, Integer pid) {
        if (pid == null) {
            return ResultUtil.setError(SystemCon.RERROR2, "商品id为空", token);
        }
        List<ProductInfo> list = ductMapper.selectdetail(pid);
        PageInfo<ProductInfo> info = new PageInfo<>(list);
        return ResultUtil.setPage(token, null, "ok", info.getList(), info.getTotal(), info.getPages(), info.getPageNum(), info.getPageSize());

    }
}
