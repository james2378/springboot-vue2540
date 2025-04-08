package com.entity.view;

import com.entity.QichexiadanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 汽车下单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-12 15:08:50
 */
@TableName("qichexiadan")
public class QichexiadanView  extends QichexiadanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QichexiadanView(){
	}
 
 	public QichexiadanView(QichexiadanEntity qichexiadanEntity){
 	try {
			BeanUtils.copyProperties(this, qichexiadanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
