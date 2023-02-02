package com.qxw.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qxw.common.utils.PageUtils;
import com.qxw.gulimall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku
 *
 * @author qxw
 * @email qxw@qq.com
 * @date 2023-02-02 11:14:49
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

