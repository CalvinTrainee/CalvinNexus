package com.calvinnexus.content.service;

import com.calvinnexus.content.model.dto.SaveTeachplanDto;
import com.calvinnexus.content.model.dto.TeachplanDto;

import java.util.List;

/**
 * @version 1.0
 * @description 项目计划管理相关接口
 */
public interface TeachplanService {
    /**
     * 根据项目id查询项目计划
     *
     * @param courseId 项目计划
     * @return
     */
    public List<TeachplanDto> findTeachplanTree(Long courseId);

    /**
     * 新增/修改/保存项目计划
     *
     * @param saveTeachplanDto
     */
    public void saveTeachplan(SaveTeachplanDto saveTeachplanDto);
}
