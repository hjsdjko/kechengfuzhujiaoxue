package com.entity.vo;

import com.entity.KechengziyuanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 课程资源
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("kechengziyuan")
public class KechengziyuanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
