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
 * 退票订单
 * 数据库通用操作实体类（普通增删改查）
 */
@TableName("tuipiaodingdan")
public class TuipiaodingdanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TuipiaodingdanEntity() {

	}

	public TuipiaodingdanEntity(T t) {
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
	 * 订单编号
	 */

	private String dingdanbianhao;

	/**
	 * 车次名称
	 */

	private String checimingcheng;

	/**
	 * 车牌
	 */

	private String chepai;

	/**
	 * 票数
	 */

	private String piaoshu;

	/**
	 * 车票图片
	 */

	private String chepiaotupian;

	/**
	 * 总价格
	 */

	private Integer zongjiage;

	/**
	 * 退票原因
	 */

	private String tuipiaoyuanyin;

	/**
	 * 退票日期
	 */

	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
	private Date tuipiaoriqi;

	/**
	 * 用户名
	 */

	private String yonghuming;

	/**
	 * 姓名
	 */

	private String xingming;

	/**
	 * 身份证
	 */

	private String shenfenzheng;

	/**
	 * 手机
	 */

	private String shouji;

	/**
	 * 是否审核
	 */

	private String sfsh;

	/**
	 * 审核回复
	 */

	private String shhf;


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
	 * 设置：订单编号
	 */
	public void setDingdanbianhao(String dingdanbianhao) {
		this.dingdanbianhao = dingdanbianhao;
	}
	/**
	 * 获取：订单编号
	 */
	public String getDingdanbianhao() {
		return dingdanbianhao;
	}
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
	 * 设置：票数
	 */
	public void setPiaoshu(String piaoshu) {
		this.piaoshu = piaoshu;
	}
	/**
	 * 获取：票数
	 */
	public String getPiaoshu() {
		return piaoshu;
	}
	/**
	 * 设置：车票图片
	 */
	public void setChepiaotupian(String chepiaotupian) {
		this.chepiaotupian = chepiaotupian;
	}
	/**
	 * 获取：车票图片
	 */
	public String getChepiaotupian() {
		return chepiaotupian;
	}
	/**
	 * 设置：总价格
	 */
	public void setZongjiage(Integer zongjiage) {
		this.zongjiage = zongjiage;
	}
	/**
	 * 获取：总价格
	 */
	public Integer getZongjiage() {
		return zongjiage;
	}
	/**
	 * 设置：退票原因
	 */
	public void setTuipiaoyuanyin(String tuipiaoyuanyin) {
		this.tuipiaoyuanyin = tuipiaoyuanyin;
	}
	/**
	 * 获取：退票原因
	 */
	public String getTuipiaoyuanyin() {
		return tuipiaoyuanyin;
	}
	/**
	 * 设置：退票日期
	 */
	public void setTuipiaoriqi(Date tuipiaoriqi) {
		this.tuipiaoriqi = tuipiaoriqi;
	}
	/**
	 * 获取：退票日期
	 */
	public Date getTuipiaoriqi() {
		return tuipiaoriqi;
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
