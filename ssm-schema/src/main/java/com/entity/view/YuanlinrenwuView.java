package com.entity.view;

import com.entity.YuanlinrenwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 园林任务
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-10-22 19:38:19
 */
@TableName("yuanlinrenwu")
public class YuanlinrenwuView  extends YuanlinrenwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuanlinrenwuView(){
	}
 
 	public YuanlinrenwuView(YuanlinrenwuEntity yuanlinrenwuEntity){
 	try {
			BeanUtils.copyProperties(this, yuanlinrenwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
