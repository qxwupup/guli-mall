package com.qxw.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qxw.common.utils.PageUtils;
import com.qxw.gulimall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 
 *
 * @author qxw
 * @email qxw@qq.com
 * @date 2023-02-02 14:03:32
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

