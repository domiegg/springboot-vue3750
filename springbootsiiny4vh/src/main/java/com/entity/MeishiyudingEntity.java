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
 * 美食预定
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-18 13:31:37
 */
@TableName("meishiyuding")
public class MeishiyudingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public MeishiyudingEntity() {
		
	}
	
	public MeishiyudingEntity(T t) {
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
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 美食名称
	 */
					
	private String meishimingcheng;
	
	/**
	 * 美食分类
	 */
					
	private String meishifenlei;
	
	/**
	 * 封面
	 */
					
	private String fengmian;
	
	/**
	 * 价格
	 */
					
	private Double jiage;
	
	/**
	 * 预定数量
	 */
					
	private Integer yudingshuliang;
	
	/**
	 * 预定金额
	 */
					
	private Double yudingjine;
	
	/**
	 * 美食地点
	 */
					
	private String meishididian;
	
	/**
	 * 美食评分
	 */
					
	private String meishipingfen;
	
	/**
	 * 视频介绍
	 */
					
	private String shipinjieshao;
	
	/**
	 * 美食主料
	 */
					
	private String meishizhuliao;
	
	/**
	 * 美食口味
	 */
					
	private String meishikouwei;
	
	/**
	 * 美食特色
	 */
					
	private String meishitese;
	
	/**
	 * 烹饪方法
	 */
					
	private String pengrenfangfa;
	
	/**
	 * 美食详情
	 */
					
	private String meishixiangqing;
	
	/**
	 * 预定时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date yudingshijian;
	
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
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
	 * 设置：美食名称
	 */
	public void setMeishimingcheng(String meishimingcheng) {
		this.meishimingcheng = meishimingcheng;
	}
	/**
	 * 获取：美食名称
	 */
	public String getMeishimingcheng() {
		return meishimingcheng;
	}
	/**
	 * 设置：美食分类
	 */
	public void setMeishifenlei(String meishifenlei) {
		this.meishifenlei = meishifenlei;
	}
	/**
	 * 获取：美食分类
	 */
	public String getMeishifenlei() {
		return meishifenlei;
	}
	/**
	 * 设置：封面
	 */
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
	/**
	 * 设置：价格
	 */
	public void setJiage(Double jiage) {
		this.jiage = jiage;
	}
	/**
	 * 获取：价格
	 */
	public Double getJiage() {
		return jiage;
	}
	/**
	 * 设置：预定数量
	 */
	public void setYudingshuliang(Integer yudingshuliang) {
		this.yudingshuliang = yudingshuliang;
	}
	/**
	 * 获取：预定数量
	 */
	public Integer getYudingshuliang() {
		return yudingshuliang;
	}
	/**
	 * 设置：预定金额
	 */
	public void setYudingjine(Double yudingjine) {
		this.yudingjine = yudingjine;
	}
	/**
	 * 获取：预定金额
	 */
	public Double getYudingjine() {
		return yudingjine;
	}
	/**
	 * 设置：美食地点
	 */
	public void setMeishididian(String meishididian) {
		this.meishididian = meishididian;
	}
	/**
	 * 获取：美食地点
	 */
	public String getMeishididian() {
		return meishididian;
	}
	/**
	 * 设置：美食评分
	 */
	public void setMeishipingfen(String meishipingfen) {
		this.meishipingfen = meishipingfen;
	}
	/**
	 * 获取：美食评分
	 */
	public String getMeishipingfen() {
		return meishipingfen;
	}
	/**
	 * 设置：视频介绍
	 */
	public void setShipinjieshao(String shipinjieshao) {
		this.shipinjieshao = shipinjieshao;
	}
	/**
	 * 获取：视频介绍
	 */
	public String getShipinjieshao() {
		return shipinjieshao;
	}
	/**
	 * 设置：美食主料
	 */
	public void setMeishizhuliao(String meishizhuliao) {
		this.meishizhuliao = meishizhuliao;
	}
	/**
	 * 获取：美食主料
	 */
	public String getMeishizhuliao() {
		return meishizhuliao;
	}
	/**
	 * 设置：美食口味
	 */
	public void setMeishikouwei(String meishikouwei) {
		this.meishikouwei = meishikouwei;
	}
	/**
	 * 获取：美食口味
	 */
	public String getMeishikouwei() {
		return meishikouwei;
	}
	/**
	 * 设置：美食特色
	 */
	public void setMeishitese(String meishitese) {
		this.meishitese = meishitese;
	}
	/**
	 * 获取：美食特色
	 */
	public String getMeishitese() {
		return meishitese;
	}
	/**
	 * 设置：烹饪方法
	 */
	public void setPengrenfangfa(String pengrenfangfa) {
		this.pengrenfangfa = pengrenfangfa;
	}
	/**
	 * 获取：烹饪方法
	 */
	public String getPengrenfangfa() {
		return pengrenfangfa;
	}
	/**
	 * 设置：美食详情
	 */
	public void setMeishixiangqing(String meishixiangqing) {
		this.meishixiangqing = meishixiangqing;
	}
	/**
	 * 获取：美食详情
	 */
	public String getMeishixiangqing() {
		return meishixiangqing;
	}
	/**
	 * 设置：预定时间
	 */
	public void setYudingshijian(Date yudingshijian) {
		this.yudingshijian = yudingshijian;
	}
	/**
	 * 获取：预定时间
	 */
	public Date getYudingshijian() {
		return yudingshijian;
	}
	/**
	 * 设置：用户账号
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
	/**
	 * 设置：用户姓名
	 */
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
