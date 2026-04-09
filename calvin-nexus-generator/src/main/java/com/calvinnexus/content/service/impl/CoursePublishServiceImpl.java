package com.calvinnexus.content.service.impl;

import com.calvinnexus.content.model.po.CoursePublish;
import com.calvinnexus.content.mapper.CoursePublishMapper;
import com.calvinnexus.content.service.CoursePublishService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 项目发布 服务实现类
 * </p>
 *
 
 */
@Slf4j
@Service
public class CoursePublishServiceImpl extends ServiceImpl<CoursePublishMapper, CoursePublish> implements CoursePublishService {

}
