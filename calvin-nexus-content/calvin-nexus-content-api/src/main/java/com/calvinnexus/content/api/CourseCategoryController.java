package com.calvinnexus.content.api;

import com.calvinnexus.content.model.dto.CourseCategoryTreeDto;
import com.calvinnexus.content.service.CourseCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @version 1.0
 * @description 项目分类相关接口
 */
@RestController
public class CourseCategoryController {

    @Autowired
    CourseCategoryService courseCategoryService;


    @GetMapping("/course-category/tree-nodes")
    public List<CourseCategoryTreeDto> queryTreeNodes() {
        return courseCategoryService.queryTreeNodes("1");
    }

}
