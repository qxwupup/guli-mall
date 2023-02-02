package com.qxw.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author qxw
 * @email qxw@qq.com
 * @date 2023-02-02 13:57:23
 */
@Data
@TableName("sms_home_subject")
public class HomeSubjectEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ר
	 */
	private String name;
	/**
	 * ר
	 */
	private String title;
	/**
	 * ר
	 */
	private String subTitle;
	/**
	 * 
	 */
	private Integer status;
	/**
	 * 
	 */
	private String url;
	/**
	 * 
	 */
	private Integer sort;
	/**
	 * ר
	 */
	private String img;

}
