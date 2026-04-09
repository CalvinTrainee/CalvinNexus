package com.calvinnexus.content.model.dto;

import lombok.Data;

/**
 * @version 1.0
 * @description 新增大章节、小章节、修改章节信息
 */
@Data
public class SaveTeachplanDto {

    /***
     * 教学计划id
     */
    private Long id;

    /**
     * 项目计划名称
     */
    private String pname;

    /**
     * 项目计划父级Id
     */
    private Long parentid;

    /**
     * 层级，分为1、2、3级
     */
    private Integer grade;

    /**
     * 项目类型:1视频、2文档
     */
    private String mediaType;


    /**
     * 项目标识
     */
    private Long courseId;

    /**
     * 项目发布标识
     */
    private Long coursePubId;


    /**
     * 是否支持试学或预览（试看）
     */
    private String isPreview;
}
