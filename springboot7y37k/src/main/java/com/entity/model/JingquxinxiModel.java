package com.entity.model;

import com.entity.JingquxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 景区信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2020-11-26 15:12:52
 */
public class JingquxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 分类
	 */
	
	private String fenlei;
		
	/**
	 * 景区星级
	 */
	
	private String jingquxingji;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 门票价格
	 */
	
	private Integer menpiaojiage;
		
	/**
	 * 景区地址
	 */
	
	private String jingqudizhi;
		
	/**
	 * 咨询热线
	 */
	
	private String zixunrexian;
		
	/**
	 * 景区介绍
	 */
	
	private String jingqujieshao;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：分类
	 */
	 
	public void setFenlei(String fenlei) {
		this.fenlei = fenlei;
	}
	
	/**
	 * 获取：分类
	 */
	public String getFenlei() {
		return fenlei;
	}
				
	
	/**
	 * 设置：景区星级
	 */
	 
	public void setJingquxingji(String jingquxingji) {
		this.jingquxingji = jingquxingji;
	}
	
	/**
	 * 获取：景区星级
	 */
	public String getJingquxingji() {
		return jingquxingji;
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
	 * 设置：门票价格
	 */
	 
	public void setMenpiaojiage(Integer menpiaojiage) {
		this.menpiaojiage = menpiaojiage;
	}
	
	/**
	 * 获取：门票价格
	 */
	public Integer getMenpiaojiage() {
		return menpiaojiage;
	}
				
	
	/**
	 * 设置：景区地址
	 */
	 
	public void setJingqudizhi(String jingqudizhi) {
		this.jingqudizhi = jingqudizhi;
	}
	
	/**
	 * 获取：景区地址
	 */
	public String getJingqudizhi() {
		return jingqudizhi;
	}
				
	
	/**
	 * 设置：咨询热线
	 */
	 
	public void setZixunrexian(String zixunrexian) {
		this.zixunrexian = zixunrexian;
	}
	
	/**
	 * 获取：咨询热线
	 */
	public String getZixunrexian() {
		return zixunrexian;
	}
				
	
	/**
	 * 设置：景区介绍
	 */
	 
	public void setJingqujieshao(String jingqujieshao) {
		this.jingqujieshao = jingqujieshao;
	}
	
	/**
	 * 获取：景区介绍
	 */
	public String getJingqujieshao() {
		return jingqujieshao;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
