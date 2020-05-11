package org.sang.controller;

import io.swagger.annotations.Api;
import org.sang.entity.Msg;
import org.sang.service.MsgService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 站内信息表(Msg)表控制层
 *
 * @author makejava
 * @since 2020-05-08 15:59:37
 */
@RestController
@RequestMapping("/msg")
@Api(tags = "站内信息接口")
public class MsgController {
    /**
     * 服务对象
     */
    @Resource
    private MsgService msgService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Msg selectOne(Long id) {
        return this.msgService.queryById(id);
    }

    @GetMapping("selectAll")
    public String selectAll(){
        return msgService.queryAllByLimit(0,4).toString();
    }
}