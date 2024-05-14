package com.entity.view;

import com.entity.FabujiaoanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 教案信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("fabujiaoan")
public class FabujiaoanView extends FabujiaoanEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 教案类型的值
		*/
		private String fabujiaoanValue;



	public FabujiaoanView() {

	}

	public FabujiaoanView(FabujiaoanEntity fabujiaoanEntity) {
		try {
			BeanUtils.copyProperties(this, fabujiaoanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 教案类型的值
			*/
			public String getFabujiaoanValue() {
				return fabujiaoanValue;
			}
			/**
			* 设置： 教案类型的值
			*/
			public void setFabujiaoanValue(String fabujiaoanValue) {
				this.fabujiaoanValue = fabujiaoanValue;
			}











}
