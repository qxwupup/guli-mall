package com.qxw.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qxw.common.utils.PageUtils;
import com.qxw.gulimall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * Ʒ
 *
 * @author qxw
 * @email qxw@qq.com
 * @date 2023-02-02 11:14:50
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

