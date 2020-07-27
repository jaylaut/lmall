package com.jay.imall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jay.imall.common.utils.PageUtils;
import com.jay.imall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author LauJay
 * @email cool_manson@163.com
 * @date 2020-07-27 14:58:13
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

