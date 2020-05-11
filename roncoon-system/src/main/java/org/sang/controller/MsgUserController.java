package org.sang.controller;

import io.swagger.annotations.Api;
import org.sang.entity.MsgUser;
import org.sang.service.MsgUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 站内信用户记录表(MsgUser)表控制层
 *
 * @author makejava
 * @since 2020-05-08 15:25:29
 */
@RestController
@RequestMapping("/msgUser")
@Api(tags = "站内信用户管理接口")
public class MsgUserController {
    /**
     * 服务对象
     */
    @Autowired
    private MsgUserService msgUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public MsgUser selectOne(Long id) {
        return this.msgUserService.queryById(id);
    }

    @GetMapping("selectAll")
    public String selectAll(){
        return this.msgUserService.queryAllByLimit(0,4).toString();
    }
}