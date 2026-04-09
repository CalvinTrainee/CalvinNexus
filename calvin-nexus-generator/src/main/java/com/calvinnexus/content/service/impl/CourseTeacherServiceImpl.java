package com.calvinnexus.content.service.impl;

import com.calvinnexus.content.model.po.CourseTeacher;
import com.calvinnexus.content.mapper.CourseTeacherMapper;
import com.calvinnexus.content.service.CourseTeacherService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 项目-教师关系表 服务实现类
 * </p>
 *
 
 */
@Slf4j
@Service
public class CourseTeacherServiceImpl extends ServiceImpl<CourseTeacherMapper, CourseTeacher> implements CourseTeacherService {

}
