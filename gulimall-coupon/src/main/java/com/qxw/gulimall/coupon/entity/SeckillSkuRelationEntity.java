package com.qxw.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author qxw
 * @email qxw@qq.com
 * @date 2023-02-02 13:57:22
 */
@Data
@TableName("sms_seckill_sku_relation")
public class SeckillSkuRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private Long promotionId;
	/**
	 * 
	 */
	private Long promotionSessionId;
	/**
	 * 
	 */
	private Long skuId;
	/**
	 * 
	 */
	private BigDecimal seckillPrice;
	/**
	 * 
	 */
	private BigDecimal seckillCount;
	/**
	 * ÿ
	 */
	private BigDecimal seckillLimit;
	/**
	 * 
	 */
	private Integer seckillSort;

}