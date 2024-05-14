package com.entity.view;

import com.entity.XueshengchengjiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 学生成绩
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("xueshengchengji")
public class XueshengchengjiView extends XueshengchengjiEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 jiaoshi
			/**
			* 工号
			*/
			private String jiaoshiUuidNumber;
			/**
			* 教师姓名
			*/
			private String jiaoshiName;
			/**
			* 头像
			*/
			private String jiaoshiPhoto;
			/**
			* 联系方式
			*/
			private String jiaoshiPhone;
			/**
			* 邮箱
			*/
			private String jiaoshiEmail;
			/**
			* 假删
			*/
			private Integer jiaoshiDelete;

		//级联表 yonghu
			/**
			* 学号
			*/
			private String yonghuUuidNumber;
			/**
			* 学生姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 学生身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public XueshengchengjiView() {

	}

	public XueshengchengjiView(XueshengchengjiEntity xueshengchengjiEntity) {
		try {
			BeanUtils.copyProperties(this, xueshengchengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

















				//级联表的get和set jiaoshi
					/**
					* 获取： 工号
					*/
					public String getJiaoshiUuidNumber() {
						return jiaoshiUuidNumber;
					}
					/**
					* 设置： 工号
					*/
					public void setJiaoshiUuidNumber(String jiaoshiUuidNumber) {
						this.jiaoshiUuidNumber = jiaoshiUuidNumber;
					}
					/**
					* 获取： 教师姓名
					*/
					public String getJiaoshiName() {
						return jiaoshiName;
					}
					/**
					* 设置： 教师姓名
					*/
					public void setJiaoshiName(String jiaoshiName) {
						this.jiaoshiName = jiaoshiName;
					}
					/**
					* 获取： 头像
					*/
					public String getJiaoshiPhoto() {
						return jiaoshiPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setJiaoshiPhoto(String jiaoshiPhoto) {
						this.jiaoshiPhoto = jiaoshiPhoto;
					}
					/**
					* 获取： 联系方式
					*/
					public String getJiaoshiPhone() {
						return jiaoshiPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setJiaoshiPhone(String jiaoshiPhone) {
						this.jiaoshiPhone = jiaoshiPhone;
					}
					/**
					* 获取： 邮箱
					*/
					public String getJiaoshiEmail() {
						return jiaoshiEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setJiaoshiEmail(String jiaoshiEmail) {
						this.jiaoshiEmail = jiaoshiEmail;
					}
					/**
					* 获取： 假删
					*/
					public Integer getJiaoshiDelete() {
						return jiaoshiDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setJiaoshiDelete(Integer jiaoshiDelete) {
						this.jiaoshiDelete = jiaoshiDelete;
					}











				//级联表的get和set yonghu
					/**
					* 获取： 学号
					*/
					public String getYonghuUuidNumber() {
						return yonghuUuidNumber;
					}
					/**
					* 设置： 学号
					*/
					public void setYonghuUuidNumber(String yonghuUuidNumber) {
						this.yonghuUuidNumber = yonghuUuidNumber;
					}
					/**
					* 获取： 学生姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 学生姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 学生身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 学生身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}




}
