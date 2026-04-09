package com.calvinnexus.content;

import com.calvinnexus.base.model.PageParams;
import com.calvinnexus.base.model.PageResult;
import com.calvinnexus.content.model.dto.CourseCategoryTreeDto;
import com.calvinnexus.content.model.dto.QueryCourseParamsDto;
import com.calvinnexus.content.model.po.CourseBase;
import com.calvinnexus.content.service.CourseBaseInfoService;
import com.calvinnexus.content.service.CourseCategoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @version 1.0
 * @description TODO
 */
@SpringBootTest
public class CourseCategoryServiceTests {

    @Autowired
    CourseCategoryService courseCategoryService;

    @Test
    public void testCourseCategoryService() {

        List<CourseCategoryTreeDto> courseCategoryTreeDtos = courseCategoryService.queryTreeNodes("1");
        System.out.println(courseCategoryTreeDtos);

    }
}
