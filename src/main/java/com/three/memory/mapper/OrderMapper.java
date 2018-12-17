package com.three.memory.mapper;

import com.three.memory.domain.OderDetail;
import com.three.memory.domain.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {
    int createOrder(List<Order> orders);

    List<OderDetail> getOrder(@Param("uid") Integer uid, @Param("flag") Integer flag);
}
