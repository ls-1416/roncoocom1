package org.sang.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.sang.entity.User;
import org.sang.service.SysUserService;
import org.sang.service.impl.SysUserServiceImpl;
import org.sang.util.MyLog;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用户基本信息(User)表控制层
 *
 * @author makejava
 * @since 2020-05-12 17:18:14
 */
@RestController
@RequestMapping("user")
@Api(tags = "学员管理")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private SysUserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value="根据id查询用户",httpMethod = "GET")
    //登录映射
    @MyLog(value = "根据id查询用户")
    @GetMapping("selectOne")
    public User selectOne(Long id) {
        User user=null;
        try{
            user=userService.queryById(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }

}