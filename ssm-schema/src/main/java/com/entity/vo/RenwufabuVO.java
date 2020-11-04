package com.entity.vo;

import com.entity.RenwufabuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 任务发布
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2020-10-22 19:38:19
 */
public class RenwufabuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 区域
	 */
	
	private String quyu;
		
	/**
	 * 工作要求
	 */
	
	private String gongzuoyaoqiu;
		
	/**
	 * 任务日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date renwuriqi;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
				
	
	/**
	 * 设置：工号
	 */
	 
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：区域
	 */
	 
	public void setQuyu(String quyu) {
		this.quyu = quyu;
	}
	
	/**
	 * 获取：区域
	 */
	public String getQuyu() {
		return quyu;
	}
				
	
	/**
	 * 设置：工作要求
	 */
	 
	public void setGongzuoyaoqiu(String gongzuoyaoqiu) {
		this.gongzuoyaoqiu = gongzuoyaoqiu;
	}
	
	/**
	 * 获取：工作要求
	 */
	public String getGongzuoyaoqiu() {
		return gongzuoyaoqiu;
	}
				
	
	/**
	 * 设置：任务日期
	 */
	 
	public void setRenwuriqi(Date renwuriqi) {
		this.renwuriqi = renwuriqi;
	}
	
	/**
	 * 获取：任务日期
	 */
	public Date getRenwuriqi() {
		return renwuriqi;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
			
}
