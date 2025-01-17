package com.entity.vo;

import com.entity.GoupiaodingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;


/**
 * 购票订单
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
public class GoupiaodingdanVO  implements Serializable {
	private static final long serialVersionUID = 1L;


	/**
	 * 车次名称
	 */

	private String checimingcheng;

	/**
	 * 车牌
	 */

	private String chepai;

	/**
	 * 起点站
	 */

	private String qidianzhan;

	/**
	 * 终点站
	 */

	private String zhongdianzhan;

	/**
	 * 出发时间
	 */

	private String chufashijian;

	/**
	 * 座位类型
	 */

	private String zuoweileixing;

	/**
	 * 价格
	 */

	private String jiage;

	/**
	 * 票数
	 */

	private Integer piaoshu;

	/**
	 * 总价格
	 */

	private String zongjiage;

	/**
	 * 购买日期
	 */

	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date goumairiqi;

	/**
	 * 用户名
	 */

	private String yonghuming;

	/**
	 * 姓名
	 */

	private String xingming;

	/**
	 * 手机
	 */

	private String shouji;

	/**
	 * 身份证
	 */

	private String shenfenzheng;

	/**
	 * 是否支付
	 */

	private String ispay;


	/**
	 * 设置：车次名称
	 */

	public void setChecimingcheng(String checimingcheng) {
		this.checimingcheng = checimingcheng;
	}

	/**
	 * 获取：车次名称
	 */
	public String getChecimingcheng() {
		return checimingcheng;
	}


	/**
	 * 设置：车牌
	 */

	public void setChepai(String chepai) {
		this.chepai = chepai;
	}

	/**
	 * 获取：车牌
	 */
	public String getChepai() {
		return chepai;
	}


	/**
	 * 设置：起点站
	 */

	public void setQidianzhan(String qidianzhan) {
		this.qidianzhan = qidianzhan;
	}

	/**
	 * 获取：起点站
	 */
	public String getQidianzhan() {
		return qidianzhan;
	}


	/**
	 * 设置：终点站
	 */

	public void setZhongdianzhan(String zhongdianzhan) {
		this.zhongdianzhan = zhongdianzhan;
	}

	/**
	 * 获取：终点站
	 */
	public String getZhongdianzhan() {
		return zhongdianzhan;
	}


	/**
	 * 设置：出发时间
	 */

	public void setChufashijian(String chufashijian) {
		this.chufashijian = chufashijian;
	}

	/**
	 * 获取：出发时间
	 */
	public String getChufashijian() {
		return chufashijian;
	}


	/**
	 * 设置：座位类型
	 */

	public void setZuoweileixing(String zuoweileixing) {
		this.zuoweileixing = zuoweileixing;
	}

	/**
	 * 获取：座位类型
	 */
	public String getZuoweileixing() {
		return zuoweileixing;
	}


	/**
	 * 设置：价格
	 */

	public void setJiage(String jiage) {
		this.jiage = jiage;
	}

	/**
	 * 获取：价格
	 */
	public String getJiage() {
		return jiage;
	}


	/**
	 * 设置：票数
	 */

	public void setPiaoshu(Integer piaoshu) {
		this.piaoshu = piaoshu;
	}

	/**
	 * 获取：票数
	 */
	public Integer getPiaoshu() {
		return piaoshu;
	}


	/**
	 * 设置：总价格
	 */

	public void setZongjiage(String zongjiage) {
		this.zongjiage = zongjiage;
	}

	/**
	 * 获取：总价格
	 */
	public String getZongjiage() {
		return zongjiage;
	}


	/**
	 * 设置：购买日期
	 */

	public void setGoumairiqi(Date goumairiqi) {
		this.goumairiqi = goumairiqi;
	}

	/**
	 * 获取：购买日期
	 */
	public Date getGoumairiqi() {
		return goumairiqi;
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
	 * 设置：手机
	 */

	public void setShouji(String shouji) {
		this.shouji = shouji;
	}

	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}


	/**
	 * 设置：身份证
	 */

	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}

	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
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
