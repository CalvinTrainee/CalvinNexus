package com.calvinnexus.content;

import com.calvinnexus.content.mapper.CourseCategoryMapper;
import com.calvinnexus.content.mapper.TeachplanMapper;
import com.calvinnexus.content.model.dto.CourseCategoryTreeDto;
import com.calvinnexus.content.model.dto.TeachplanDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @version 1.0
 * @description 项目计划mapper测试
 */
@SpringBootTest
public class TeachplanMapperTests {

    @Autowired
    TeachplanMapper teachplanMapper;

    @Test
    public void testSelectTreeNodes() {
        List<TeachplanDto> teachplanDtos = teachplanMapper.selectTreeNodes(117L);
        System.out.println(teachplanDtos);
    }
}
