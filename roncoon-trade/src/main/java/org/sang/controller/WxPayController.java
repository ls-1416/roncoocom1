package org.sang.controller;


//import config.WxPayUtil;
//import config.WxRequestParam;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
import org.sang.config.WxPayUtil;
import org.sang.config.WxRequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
//import service.HotelOrderService;
//import springfox.documentation.annotations.ApiIgnore;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
//@Api("微信支付模块")
//@RequestMapping("/wexin/")
public class WxPayController {

//    @Resource
//    private HotelOrderService orderService;

    /**
     * 从页面获取参数
     *  @param orderNo 订单号
     * @param body 描述
     * @param money 金额
     * @param session
     * @return
     */
//    @ApiIgnore
    @RequestMapping(value = "/weixin/pay",method = RequestMethod.POST)
    @ResponseBody
    public String pay(String orderNo,String body, String money, HttpSession session) {
        System.out.println("第一个方法----------------"+orderNo);
        WxRequestParam param = new WxRequestParam();
        /*String bo=null;
        try {
            System.out.println("转换前："+body);
            bo=new String(body.getBytes("ISO-8859-1"),"UTF-8");
            System.out.println("转换后："+bo);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }*/
        param.setBody(body);
        param.setTotal_fee(money);
        param.setOut_trade_no(String.valueOf(System.currentTimeMillis()));

        session.setAttribute("tradeNo", param.getOut_trade_no());   //保存交易号
        session.setAttribute("orderNo",orderNo);                    //保存订单号
        System.out.println("第一个方法tradeNo值："+param.getOut_trade_no());
        String codeUrl= WxPayUtil.getCodeUrl(param);
        return codeUrl;
    }

    /**
     * 验证支付方法
     * @param session
     * @return
     */
//    @ApiIgnore
    @RequestMapping(value = "query",method = RequestMethod.POST)
    @ResponseBody
    public Object queryOrderState(HttpSession session) {
        System.out.println("第二个方法----------------");
        String orderId=(String) session.getAttribute("tradeNo");
        System.out.println("交易号："+orderId);
        WxRequestParam param = new WxRequestParam();
        param.setOut_trade_no(orderId);
        boolean result=WxPayUtil.queryOrderState(param);    //支付成功返回true
        return result;
    }

    @RequestMapping(value = "index",method = RequestMethod.GET)
//    @ApiOperation(value ="进入支付")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index1");
        System.out.println("index方法----------------");
        return mv;
    }

    /**
     * 支付成功调用
     * @return
     */
//    @ApiIgnore
    @RequestMapping(value = "success",method = RequestMethod.GET)
    public ModelAndView success(HttpSession session) throws Exception {
        System.out.println("success方法----------------");

        String orderNo=(String) session.getAttribute("orderNo");
        String tradeNo=(String)session.getAttribute("tradeNo");
        System.out.println(orderNo);
        System.out.println(tradeNo);
//        orderService.paySuccess(orderNo,2,tradeNo);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("success");
        return mv;
//        return "success";
    }

    /**
     *
     * @return
     */
//    @ApiIgnore
    @RequestMapping(value = "notice")
    public ModelAndView notice() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("notice");
        return mv;
    }
}
