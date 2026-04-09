package com.calvinnexus.content.api;

import com.calvinnexus.base.exception.ValidationGroups;
import com.calvinnexus.base.model.PageParams;
import com.calvinnexus.base.model.PageResult;
import com.calvinnexus.content.model.dto.AddCourseDto;
import com.calvinnexus.content.model.dto.CourseBaseInfoDto;
import com.calvinnexus.content.model.dto.EditCourseDto;
import com.calvinnexus.content.model.dto.QueryCourseParamsDto;
import com.calvinnexus.content.model.po.CourseBase;
import com.calvinnexus.content.service.CourseBaseInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @description TODO
 */
@Api(value = "项目信息管理接口", tags = "项目信息管理接口")
@RestController
public class CourseBaseInfoController {

    @Autowired
    CourseBaseInfoService courseBaseInfoService;

    @ApiOperation("项目分页查询接口")
    @PostMapping("/course/list")
    public PageResult<CourseBase> list(PageParams pageParams, @RequestBody(required = false) QueryCourseParamsDto queryCourseParamsDto) {

        PageResult<CourseBase> courseBasePageResult = courseBaseInfoService.queryCourseBaseList(pageParams, queryCourseParamsDto);

        return courseBasePageResult;

    }

    @ApiOperation("新增项目")
    @PostMapping("/course")
    public CourseBaseInfoDto createCourseBase(@RequestBody @Validated(ValidationGroups.Inster.class) AddCourseDto addCourseDto) {

        //获取到用户所属机构的id
        Long companyId = 1232141425L;
//        int i = 1/0;
        CourseBaseInfoDto courseBase = courseBaseInfoService.createCourseBase(companyId, addCourseDto);
        return courseBase;
    }

    @ApiOperation("根据项目id查询接口")
    @GetMapping("/course/{courseId}")
    public CourseBaseInfoDto getCourseBaseById(@PathVariable Long courseId) {
        CourseBaseInfoDto courseBaseInfo = courseBaseInfoService.getCourseBaseInfo(courseId);
        return courseBaseInfo;
    }


    @ApiOperation("修改项目")
    @PutMapping("/course")
    public CourseBaseInfoDto modifyCourseBase(@RequestBody @Validated(ValidationGroups.Update.class) EditCourseDto editCourseDto) {
        //获取到用户所属机构的id
        Long companyId = 1232141425L;
        CourseBaseInfoDto courseBaseInfoDto = courseBaseInfoService.updateCourseBase(companyId, editCourseDto);
        return courseBaseInfoDto;
    }


}
