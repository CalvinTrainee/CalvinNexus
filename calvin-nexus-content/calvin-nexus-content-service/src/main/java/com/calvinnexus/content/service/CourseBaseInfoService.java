package com.calvinnexus.content.service;

import com.calvinnexus.base.model.PageParams;
import com.calvinnexus.base.model.PageResult;
import com.calvinnexus.content.model.dto.AddCourseDto;
import com.calvinnexus.content.model.dto.CourseBaseInfoDto;
import com.calvinnexus.content.model.dto.EditCourseDto;
import com.calvinnexus.content.model.dto.QueryCourseParamsDto;
import com.calvinnexus.content.model.po.CourseBase;

/**
 * @version 1.0
 * @description 项目信息管理接口
 */
public interface CourseBaseInfoService {

    /**
     * 项目分页查询
     *
     * @param pageParams      分页查询参数
     * @param courseParamsDto 查询条件
     * @return 查询结果
     */
    public PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto courseParamsDto);

    /**
     * 新增项目
     *
     * @param companyId    机构id
     * @param addCourseDto 项目信息
     * @return 项目详细信息
     */
    public CourseBaseInfoDto createCourseBase(Long companyId, AddCourseDto addCourseDto);

    /**
     * 根据项目id查询项目信息
     *
     * @param courseId 项目id
     * @return 项目详细信息
     */
    public CourseBaseInfoDto getCourseBaseInfo(Long courseId);

    /**
     * 修改项目
     *
     * @param companyId     机构id
     * @param editCourseDto 修改项目信息
     * @return 项目详细信息
     */
    public CourseBaseInfoDto updateCourseBase(Long companyId, EditCourseDto editCourseDto);

}
