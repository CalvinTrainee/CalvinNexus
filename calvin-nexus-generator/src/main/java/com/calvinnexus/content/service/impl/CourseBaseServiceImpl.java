package com.calvinnexus.content.service.impl;

import com.calvinnexus.content.model.po.CourseBase;
import com.calvinnexus.content.mapper.CourseBaseMapper;
import com.calvinnexus.content.service.CourseBaseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 项目基本信息 服务实现类
 * </p>
 *
 
 */
@Slf4j
@Service
public class CourseBaseServiceImpl extends ServiceImpl<CourseBaseMapper, CourseBase> implements CourseBaseService {

}
