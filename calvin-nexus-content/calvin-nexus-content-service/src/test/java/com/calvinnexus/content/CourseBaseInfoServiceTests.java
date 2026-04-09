package com.calvinnexus.content;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.calvinnexus.base.model.PageParams;
import com.calvinnexus.base.model.PageResult;
import com.calvinnexus.content.mapper.CourseBaseMapper;
import com.calvinnexus.content.model.dto.QueryCourseParamsDto;
import com.calvinnexus.content.model.po.CourseBase;
import com.calvinnexus.content.service.CourseBaseInfoService;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @version 1.0
 * @description TODO
 */
@SpringBootTest
public class CourseBaseInfoServiceTests {

    @Autowired
    CourseBaseInfoService courseBaseInfoService;

    @Test
    public void testCourseBaseInfoService() {

        //查询条件
        QueryCourseParamsDto courseParamsDto = new QueryCourseParamsDto();
        courseParamsDto.setCourseName("java");//项目名称查询条件
        courseParamsDto.setAuditStatus("202004");//202004表示项目审核通过
        //分页参数对象
        PageParams pageParams = new PageParams();
        pageParams.setPageNo(2L);
        pageParams.setPageSize(2L);

        PageResult<CourseBase> courseBasePageResult = courseBaseInfoService.queryCourseBaseList(pageParams, courseParamsDto);
        System.out.println(courseBasePageResult);

    }
}
