package com.entity.view;

import com.entity.GaiqiandingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;


/**
 * 改签订单
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("gaiqiandingdan")
public class GaiqiandingdanView  extends GaiqiandingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GaiqiandingdanView(){
	}

 	public GaiqiandingdanView(GaiqiandingdanEntity gaiqiandingdanEntity){
 	try {
			BeanUtils.copyProperties(this, gaiqiandingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
