package com.entity.model;

import com.entity.KechengziyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 课程资源
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KechengziyuanModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 课程名称
     */
    private String kechengziyuanName;


    /**
     * 课程封面
     */
    private String kechengziyuanPhoto;


    /**
     * 课程视频
     */
    private String kechengziyuanVideo;


    /**
     * 课程文件
     */
    private String kechengziyuanFile;


    /**
     * 课程类型
     */
    private Integer kechengziyuanTypes;


    /**
     * 课程详情
     */
    private String kechengziyuanContent;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：课程名称
	 */
    public String getKechengziyuanName() {
        return kechengziyuanName;
    }


    /**
	 * 设置：课程名称
	 */
    public void setKechengziyuanName(String kechengziyuanName) {
        this.kechengziyuanName = kechengziyuanName;
    }
    /**
	 * 获取：课程封面
	 */
    public String getKechengziyuanPhoto() {
        return kechengziyuanPhoto;
    }


    /**
	 * 设置：课程封面
	 */
    public void setKechengziyuanPhoto(String kechengziyuanPhoto) {
        this.kechengziyuanPhoto = kechengziyuanPhoto;
    }
    /**
	 * 获取：课程视频
	 */
    public String getKechengziyuanVideo() {
        return kechengziyuanVideo;
    }


    /**
	 * 设置：课程视频
	 */
    public void setKechengziyuanVideo(String kechengziyuanVideo) {
        this.kechengziyuanVideo = kechengziyuanVideo;
    }
    /**
	 * 获取：课程文件
	 */
    public String getKechengziyuanFile() {
        return kechengziyuanFile;
    }


    /**
	 * 设置：课程文件
	 */
    public void setKechengziyuanFile(String kechengziyuanFile) {
        this.kechengziyuanFile = kechengziyuanFile;
    }
    /**
	 * 获取：课程类型
	 */
    public Integer getKechengziyuanTypes() {
        return kechengziyuanTypes;
    }


    /**
	 * 设置：课程类型
	 */
    public void setKechengziyuanTypes(Integer kechengziyuanTypes) {
        this.kechengziyuanTypes = kechengziyuanTypes;
    }
    /**
	 * 获取：课程详情
	 */
    public String getKechengziyuanContent() {
        return kechengziyuanContent;
    }


    /**
	 * 设置：课程详情
	 */
    public void setKechengziyuanContent(String kechengziyuanContent) {
        this.kechengziyuanContent = kechengziyuanContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
