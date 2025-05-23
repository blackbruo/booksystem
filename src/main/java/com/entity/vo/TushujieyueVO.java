package com.entity.vo;

import com.entity.TushujieyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 图书借阅
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-12 12:42:40
 */
public class TushujieyueVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图书名称
	 */
	
	private String tushumingcheng;
		
	/**
	 * 图书分类
	 */
	
	private String tushufenlei;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 可借天数
	 */
	
	private String kejietianshu;
		
	/**
	 * 可借数量
	 */
	
	private String kejieshuliang;
		
	/**
	 * 借阅日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jieyueriqi;
		
	/**
	 * 借阅天数
	 */
	
	private String jieyuetianshu;
		
	/**
	 * 应还日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date yinghairiqi;
		
	/**
	 * 借阅状态
	 */
	
	private String jieyuezhuangtai;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：图书名称
	 */
	 
	public void setTushumingcheng(String tushumingcheng) {
		this.tushumingcheng = tushumingcheng;
	}
	
	/**
	 * 获取：图书名称
	 */
	public String getTushumingcheng() {
		return tushumingcheng;
	}
				
	
	/**
	 * 设置：图书分类
	 */
	 
	public void setTushufenlei(String tushufenlei) {
		this.tushufenlei = tushufenlei;
	}
	
	/**
	 * 获取：图书分类
	 */
	public String getTushufenlei() {
		return tushufenlei;
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
	 * 设置：可借天数
	 */
	 
	public void setKejietianshu(String kejietianshu) {
		this.kejietianshu = kejietianshu;
	}
	
	/**
	 * 获取：可借天数
	 */
	public String getKejietianshu() {
		return kejietianshu;
	}
				
	
	/**
	 * 设置：可借数量
	 */
	 
	public void setKejieshuliang(String kejieshuliang) {
		this.kejieshuliang = kejieshuliang;
	}
	
	/**
	 * 获取：可借数量
	 */
	public String getKejieshuliang() {
		return kejieshuliang;
	}
				
	
	/**
	 * 设置：借阅日期
	 */
	 
	public void setJieyueriqi(Date jieyueriqi) {
		this.jieyueriqi = jieyueriqi;
	}
	
	/**
	 * 获取：借阅日期
	 */
	public Date getJieyueriqi() {
		return jieyueriqi;
	}
				
	
	/**
	 * 设置：借阅天数
	 */
	 
	public void setJieyuetianshu(String jieyuetianshu) {
		this.jieyuetianshu = jieyuetianshu;
	}
	
	/**
	 * 获取：借阅天数
	 */
	public String getJieyuetianshu() {
		return jieyuetianshu;
	}
				
	
	/**
	 * 设置：应还日期
	 */
	 
	public void setYinghairiqi(Date yinghairiqi) {
		this.yinghairiqi = yinghairiqi;
	}
	
	/**
	 * 获取：应还日期
	 */
	public Date getYinghairiqi() {
		return yinghairiqi;
	}
				
	
	/**
	 * 设置：借阅状态
	 */
	 
	public void setJieyuezhuangtai(String jieyuezhuangtai) {
		this.jieyuezhuangtai = jieyuezhuangtai;
	}
	
	/**
	 * 获取：借阅状态
	 */
	public String getJieyuezhuangtai() {
		return jieyuezhuangtai;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
