package com.jay.imall.order.dao;

import com.jay.imall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author LauJay
 * @email cool_manson@163.com
 * @date 2020-07-27 15:06:17
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
