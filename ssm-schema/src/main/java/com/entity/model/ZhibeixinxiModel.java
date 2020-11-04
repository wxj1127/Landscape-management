package com.entity.model;

import com.entity.ZhibeixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 植被信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2020-10-22 19:38:19
 */
public class ZhibeixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
