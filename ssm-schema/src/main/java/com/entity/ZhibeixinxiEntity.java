package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 植被信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2020-10-22 19:38:19
 */
@TableName("zhibeixinxi")
public class ZhibeixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhibeixinxiEntity() {
		
	}
	
	public ZhibeixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 名称
	 */
					
	private String mingcheng;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 区域
	 */
					
	private String quyu;
	
	/**
	 * 温度
	 */
					
	private String wendu;
	
	/**
	 * 湿度
	 */
					
	private String shidu;
	
	/**
	 * 工作情况
	 */
					
	private String gongzuoqingkuang;
	
	/**
	 * 变化情况
	 */
					
	private String bianhuaqingkuang;
	
	/**
	 * 登记日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date dengjiriqi;
	
	/**
	 * 工号
	 */
					
	private String gonghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：名称
	 */
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	/**
	 * 获取：名称
	 */
	public String getMingcheng() {
		return mingcheng;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
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
	 * 设置：温度
	 */
	public void setWendu(String wendu) {
		this.wendu = wendu;
	}
	/**
	 * 获取：温度
	 */
	public String getWendu() {
		return wendu;
	}
	/**
	 * 设置：湿度
	 */
	public void setShidu(String shidu) {
		this.shidu = shidu;
	}
	/**
	 * 获取：湿度
	 */
	public String getShidu() {
		return shidu;
	}
	/**
	 * 设置：工作情况
	 */
	public void setGongzuoqingkuang(String gongzuoqingkuang) {
		this.gongzuoqingkuang = gongzuoqingkuang;
	}
	/**
	 * 获取：工作情况
	 */
	public String getGongzuoqingkuang() {
		return gongzuoqingkuang;
	}
	/**
	 * 设置：变化情况
	 */
	public void setBianhuaqingkuang(String bianhuaqingkuang) {
		this.bianhuaqingkuang = bianhuaqingkuang;
	}
	/**
	 * 获取：变化情况
	 */
	public String getBianhuaqingkuang() {
		return bianhuaqingkuang;
	}
	/**
	 * 设置：登记日期
	 */
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
	}
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

}
