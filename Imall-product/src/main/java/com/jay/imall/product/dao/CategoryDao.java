package com.jay.imall.product.dao;

import com.jay.imall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author LauJay
 * @email cool_manson@163.com
 * @date 2020-07-27 10:02:24
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
