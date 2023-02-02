package com.qxw.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qxw.common.utils.PageUtils;
import com.qxw.gulimall.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 
 *
 * @author qxw
 * @email qxw@qq.com
 * @date 2023-02-02 13:57:23
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

