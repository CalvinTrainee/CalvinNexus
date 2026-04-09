package com.calvinnexus.content.service.impl;

import com.calvinnexus.content.model.po.CourseCategory;
import com.calvinnexus.content.mapper.CourseCategoryMapper;
import com.calvinnexus.content.service.CourseCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 项目分类 服务实现类
 * </p>
 *
 
 */
@Slf4j
@Service
public class CourseCategoryServiceImpl extends ServiceImpl<CourseCategoryMapper, CourseCategory> implements CourseCategoryService {

}
