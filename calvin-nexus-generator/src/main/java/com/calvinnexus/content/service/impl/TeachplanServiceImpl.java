package com.calvinnexus.content.service.impl;

import com.calvinnexus.content.model.po.Teachplan;
import com.calvinnexus.content.mapper.TeachplanMapper;
import com.calvinnexus.content.service.TeachplanService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 项目计划 服务实现类
 * </p>
 */
@Slf4j
@Service
public class TeachplanServiceImpl extends ServiceImpl<TeachplanMapper, Teachplan> implements TeachplanService {

}
