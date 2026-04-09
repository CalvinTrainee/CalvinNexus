package com.calvinnexus.content;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.calvinnexus.base.model.PageParams;
import com.calvinnexus.base.model.PageResult;
import com.calvinnexus.content.mapper.CourseBaseMapper;
import com.calvinnexus.content.mapper.CourseCategoryMapper;
import com.calvinnexus.content.model.dto.CourseCategoryTreeDto;
import com.calvinnexus.content.model.dto.QueryCourseParamsDto;
import com.calvinnexus.content.model.po.CourseBase;
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
public class CourseCategoryMapperTests {

    @Autowired
    CourseCategoryMapper courseCategoryMapper;

    @Test
    public void testCourseCategoryMapper() {
        List<CourseCategoryTreeDto> courseCategoryTreeDtos = courseCategoryMapper.selectTreeNodes("1");
        System.out.println(courseCategoryTreeDtos);
    }
}
