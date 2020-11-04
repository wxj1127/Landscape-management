package com.entity.view;

import com.entity.YuanlinbaogaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 园林报告
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-10-22 19:38:19
 */
@TableName("yuanlinbaogao")
public class YuanlinbaogaoView  extends YuanlinbaogaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuanlinbaogaoView(){
	}
 
 	public YuanlinbaogaoView(YuanlinbaogaoEntity yuanlinbaogaoEntity){
 	try {
			BeanUtils.copyProperties(this, yuanlinbaogaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
