package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 课程资源
 *
 * @author 
 * @email
 */
@TableName("kechengziyuan")
public class KechengziyuanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KechengziyuanEntity() {

	}

	public KechengziyuanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 课程名称
     */
    @TableField(value = "kechengziyuan_name")

    private String kechengziyuanName;


    /**
     * 课程封面
     */
    @TableField(value = "kechengziyuan_photo")

    private String kechengziyuanPhoto;


    /**
     * 课程视频
     */
    @TableField(value = "kechengziyuan_video")

    private String kechengziyuanVideo;


    /**
     * 课程文件
     */
    @TableField(value = "kechengziyuan_file")

    private String kechengziyuanFile;


    /**
     * 课程类型
     */
    @TableField(value = "kechengziyuan_types")

    private Integer kechengziyuanTypes;


    /**
     * 课程详情
     */
    @TableField(value = "kechengziyuan_content")

    private String kechengziyuanContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：课程名称
	 */
    public String getKechengziyuanName() {
        return kechengziyuanName;
    }


    /**
	 * 获取：课程名称
	 */

    public void setKechengziyuanName(String kechengziyuanName) {
        this.kechengziyuanName = kechengziyuanName;
    }
    /**
	 * 设置：课程封面
	 */
    public String getKechengziyuanPhoto() {
        return kechengziyuanPhoto;
    }


    /**
	 * 获取：课程封面
	 */

    public void setKechengziyuanPhoto(String kechengziyuanPhoto) {
        this.kechengziyuanPhoto = kechengziyuanPhoto;
    }
    /**
	 * 设置：课程视频
	 */
    public String getKechengziyuanVideo() {
        return kechengziyuanVideo;
    }


    /**
	 * 获取：课程视频
	 */

    public void setKechengziyuanVideo(String kechengziyuanVideo) {
        this.kechengziyuanVideo = kechengziyuanVideo;
    }
    /**
	 * 设置：课程文件
	 */
    public String getKechengziyuanFile() {
        return kechengziyuanFile;
    }


    /**
	 * 获取：课程文件
	 */

    public void setKechengziyuanFile(String kechengziyuanFile) {
        this.kechengziyuanFile = kechengziyuanFile;
    }
    /**
	 * 设置：课程类型
	 */
    public Integer getKechengziyuanTypes() {
        return kechengziyuanTypes;
    }


    /**
	 * 获取：课程类型
	 */

    public void setKechengziyuanTypes(Integer kechengziyuanTypes) {
        this.kechengziyuanTypes = kechengziyuanTypes;
    }
    /**
	 * 设置：课程详情
	 */
    public String getKechengziyuanContent() {
        return kechengziyuanContent;
    }


    /**
	 * 获取：课程详情
	 */

    public void setKechengziyuanContent(String kechengziyuanContent) {
        this.kechengziyuanContent = kechengziyuanContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Kechengziyuan{" +
            "id=" + id +
            ", kechengziyuanName=" + kechengziyuanName +
            ", kechengziyuanPhoto=" + kechengziyuanPhoto +
            ", kechengziyuanVideo=" + kechengziyuanVideo +
            ", kechengziyuanFile=" + kechengziyuanFile +
            ", kechengziyuanTypes=" + kechengziyuanTypes +
            ", kechengziyuanContent=" + kechengziyuanContent +
            ", createTime=" + createTime +
        "}";
    }
}
