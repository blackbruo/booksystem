package com.entity.view;

import com.entity.DiscusstushuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 图书信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-12 12:42:40
 */
@TableName("discusstushuxinxi")
public class DiscusstushuxinxiView  extends DiscusstushuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusstushuxinxiView(){
	}
 
 	public DiscusstushuxinxiView(DiscusstushuxinxiEntity discusstushuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discusstushuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
