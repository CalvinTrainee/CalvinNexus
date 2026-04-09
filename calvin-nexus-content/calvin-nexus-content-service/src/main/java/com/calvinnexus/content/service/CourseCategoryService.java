package com.calvinnexus.content.service;

import com.calvinnexus.content.model.dto.CourseCategoryTreeDto;

import java.util.List;

/**
 * @version 1.0
 * @description TODO
 */
public interface CourseCategoryService {
    /**
     * 项目分类树形结构查询
     *
     * @return
     */
    public List<CourseCategoryTreeDto> queryTreeNodes(String id);
}
