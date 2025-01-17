package com.entity.view;

import com.entity.GoupiaodingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;


/**
 * 购票订单
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("goupiaodingdan")
public class GoupiaodingdanView  extends GoupiaodingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GoupiaodingdanView(){
	}

 	public GoupiaodingdanView(GoupiaodingdanEntity goupiaodingdanEntity){
 	try {
			BeanUtils.copyProperties(this, goupiaodingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
