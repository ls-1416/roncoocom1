package org.sang.controller;

import org.sang.entity.SysUser;
import org.sang.service.SysUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 后台用户信息(SysUser)表控制层
 *
 * @author makejava
 * @since 2020-05-08 16:49:09
 */
@RestController
@RequestMapping("sysUser")
public class SysUserController {
    /**
     * 服务对象
     */
    @Resource
    private SysUserService sysUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysUser selectOne(Integer id) {
        return this.sysUserService.queryById(id);
    }

}