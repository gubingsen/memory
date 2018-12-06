package com.three.memory.util;

import com.three.memory.constant.SystemCon;
import com.three.memory.vo.PageBean;
import com.three.memory.vo.ResultBean;

import java.util.List;

public class ResultUtil {

    //操作成功
    public static ResultBean setOK(String msg, Object data){
        ResultBean resultBean=new ResultBean();
        resultBean.setCode(SystemCon.ROK);
        resultBean.setData(data);
        resultBean.setMsg(msg);
        return resultBean;
    }
    //操作失败
    public static ResultBean setError(int code,String msg,Object data){
        ResultBean resultBean=new ResultBean();
        resultBean.setCode(code);
        resultBean.setData(data);
        resultBean.setMsg(msg);
        return resultBean;
    }
    //分页操作
    //操作成功
    public static PageBean setPageOK(int page, int limit, int count, List<Object> data){
        PageBean pageBean=new PageBean();
        pageBean.setCode(SystemCon.ROK);
        pageBean.setData(data);
        pageBean.setMsg("OK");
        pageBean.setCurrpage(page);
        pageBean.setLimit(limit);
        pageBean.setTotalcount(count);
        pageBean.setTotalpage(count%limit==0?count/limit:count/limit+1);
        return pageBean;
    }
    //非查询操作
    public static ResultBean execOp(int count,String msg){
        if(count>0){
            return setOK(msg+"成功",null);
        }else{
            return setError(SystemCon.RERROR1,msg+"失败",null);
        }
    }
}