package org.sang.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.sang.entity.OrderInfo;
import org.sang.service.OrderInfoService;
import org.sang.util.MyLog;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 订单信息表(OrderInfo)表控制层
 *
 * @author makejava
 * @since 2020-05-14 15:46:41
 */
@RestController
@RequestMapping("user/orderInfo")
@Api(tags = "订单管理")
public class OrderInfoController {
    /**
     * 服务对象
     */
    @Resource
    private OrderInfoService orderInfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value="根据id查询订单",httpMethod = "GET")
    //登录映射
    @MyLog(value = "根据id查询订单")
    @GetMapping("selectOne")
    public OrderInfo selectOne(Long id) {
        return this.orderInfoService.queryById(id);
    }

}