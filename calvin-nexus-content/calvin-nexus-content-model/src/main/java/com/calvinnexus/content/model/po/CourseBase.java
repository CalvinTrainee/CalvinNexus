package com.calvinnexus.content.model.po;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 项目基本信息
 * </p>
 */
@Data
@TableName("course_base")
public class CourseBase implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 机构ID
     */
    private Long companyId;

    /**
     * 机构名称
     */
    private String companyName;

    /**
     * 项目名称
     */
    private String name;

    /**
     * 适用人群
     */
    private String users;

    /**
     * 项目标签
     */
    private String tags;

    /**
     * 大分类
     */
    private String mt;

    /**
     * 小分类
     */
    private String st;

    /**
     * 项目等级
     */
    private String grade;

    /**
     * 教育模式(common普通，record 录播，live直播等）
     */
    private String teachmode;

    /**
     * 项目介绍
     */
    private String description;

    /**
     * 项目图片
     */
    private String pic;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createDate;

    /**
     * 修改时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime changeDate;

    /**
     * 创建人
     */
    private String createPeople;

    /**
     * 更新人
     */
    private String changePeople;

    /**
     * 审核状态
     */
    private String auditStatus;

    /**
     * 项目发布状态 未发布  已发布 下线
     */
    private String status;


}
