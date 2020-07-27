package com.jay.imall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jay.imall.common.utils.PageUtils;
import com.jay.imall.coupon.entity.PmsCategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author LauJay
 * @email cool_manson@163.com
 * @date 2020-07-27 11:10:33
 */
public interface PmsCategoryService extends IService<PmsCategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

