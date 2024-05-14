package com.entity.vo;

import com.entity.XueshengchengjiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 学生成绩
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xueshengchengji")
public class XueshengchengjiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 学生
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 教师
     */

    @TableField(value = "jiaoshi_id")
    private Integer jiaoshiId;


    /**
     * 成绩
     */

    @TableField(value = "chengji")
    private Integer chengji;


    /**
     * 学科
     */

    @TableField(value = "xueke")
    private Integer xueke;


    /**
     * 成绩详情
     */

    @TableField(value = "xueshengchengji_content")
    private String xueshengchengjiContent;


    /**
     * 创建时间
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
	 * 设置：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：学生
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：教师
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }


    /**
	 * 获取：教师
	 */

    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 设置：成绩
	 */
    public Integer getChengji() {
        return chengji;
    }


    /**
	 * 获取：成绩
	 */

    public void setChengji(Integer chengji) {
        this.chengji = chengji;
    }
    /**
	 * 设置：学科
	 */
    public Integer getXueke() {
        return xueke;
    }


    /**
	 * 获取：学科
	 */

    public void setXueke(Integer xueke) {
        this.xueke = xueke;
    }
    /**
	 * 设置：成绩详情
	 */
    public String getXueshengchengjiContent() {
        return xueshengchengjiContent;
    }


    /**
	 * 获取：成绩详情
	 */

    public void setXueshengchengjiContent(String xueshengchengjiContent) {
        this.xueshengchengjiContent = xueshengchengjiContent;
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

}
