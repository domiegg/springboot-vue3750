package com.entity.view;

import com.entity.ChepiaoyudingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 车票预定
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-18 13:31:36
 */
@TableName("chepiaoyuding")
public class ChepiaoyudingView  extends ChepiaoyudingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChepiaoyudingView(){
	}
 
 	public ChepiaoyudingView(ChepiaoyudingEntity chepiaoyudingEntity){
 	try {
			BeanUtils.copyProperties(this, chepiaoyudingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
