package com.calvinnexus.content.api;

import com.calvinnexus.content.model.dto.SaveTeachplanDto;
import com.calvinnexus.content.model.dto.TeachplanDto;
import com.calvinnexus.content.service.TeachplanService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @version 1.0
 * @description 项目计划管理相关的接口
 */
@Api(value = "项目计划编辑接口", tags = "项目计划编辑接口")
@RestController
public class TeachplanController {

    @Autowired
    TeachplanService teachplanService;

    @ApiOperation("查询项目计划树形结构")
    //查询项目计划  GET /teachplan/22/tree-nodes
    @GetMapping("/teachplan/{courseId}/tree-nodes")
    public List<TeachplanDto> getTreeNodes(@PathVariable Long courseId) {
        List<TeachplanDto> teachplanTree = teachplanService.findTeachplanTree(courseId);

        return teachplanTree;
    }

    @ApiOperation("项目计划创建或修改")
    @PostMapping("/teachplan")
    public void saveTeachplan(@RequestBody SaveTeachplanDto teachplan) {
        teachplanService.saveTeachplan(teachplan);
    }

}
