package com.calvinnexus.content.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.calvinnexus.content.model.dto.TeachplanDto;
import com.calvinnexus.content.model.po.Teachplan;

import java.util.List;

/**
 * <p>
 * 项目计划 Mapper 接口
 * </p>
 *
 
 */
public interface TeachplanMapper extends BaseMapper<Teachplan> {

    //项目计划查询
    public List<TeachplanDto> selectTreeNodes(Long courseId);

}
