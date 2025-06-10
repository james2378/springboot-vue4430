package com.entity.view;

import com.entity.DiscussjingqushangchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 景区商城评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-11-26 15:12:52
 */
@TableName("discussjingqushangcheng")
public class DiscussjingqushangchengView  extends DiscussjingqushangchengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjingqushangchengView(){
	}
 
 	public DiscussjingqushangchengView(DiscussjingqushangchengEntity discussjingqushangchengEntity){
 	try {
			BeanUtils.copyProperties(this, discussjingqushangchengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
