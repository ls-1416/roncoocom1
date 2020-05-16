//package org.sang.controller;
//
//import com.alipay.api.AlipayApiException;
//import com.alipay.api.AlipayClient;
//import com.alipay.api.DefaultAlipayClient;
//import com.alipay.api.domain.AlipayTradeWapPayModel;
//import com.alipay.api.request.AlipayTradeWapPayRequest;
//import org.sang.config.AlipayConfig;
//import org.sang.service.AlipayService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.web.bind.annotation.*;
//
//import javax.annotation.Resource;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.UnsupportedEncodingException;
//import java.util.HashMap;
//import java.util.Map;
//
//@RestController
//public class AlipayController {
//    @Autowired
//    @Qualifier("alipayService")
//    private AlipayService alipayService;
//
////    @Resource
////    AlipayConfig alipayConfig;
//
//    /**
//     * web 订单支付
//     */
//    @GetMapping("getPagePay")
//    public Map<Object, Object> getPagePay() throws Exception{
//        /** 模仿数据库，从后台调数据*/
//        String outTradeNo = "19960310621211";
//        Integer totalAmount = 1;
//        String subject = "苹果28";
//
//        String pay = alipayService.webPagePay(outTradeNo, totalAmount, subject);
//        System.out.println(pay);
//
//        Map<Object, Object> pays = new HashMap<Object, Object>();
//        pays.put("pay", pay);
//
//        return pays;
//    }
//
//    /**
//     * 向支付宝提交支付请求
//     *
//     * @param WIDout_trade_no
//     *            商户订单号，商户网站订单系统中唯一订单号，必填
//     * @param WIDsubject
//     *            订单名称，必填
//     * @param WIDtotal_amount
//     *            付款金额，必填
//     */
////    @ApiOperation(value = "订单支付", httpMethod = "POST",
////            protocols = "HTTP", produces = "application/xml", consumes="application/x-www-form-urlencoded",
////            response =  String.class,
////            notes = "客户端提交订单支付请求，对该API的返回结果不用处理，浏览器将自动跳转至支付宝。<br><b>请使用普通表单提交，不能使用ajax异步提交。</b>")
//    @RequestMapping(value = "alipay", method = RequestMethod.POST,produces="application/xml", consumes="application/x-www-form-urlencoded")
//    public void pay(
////            @ApiParam(name="WIDout_trade_no",value="订单编号",required=true)
//            @RequestParam String WIDout_trade_no,
////            @ApiParam(name="WIDsubject",value="订单名称",required=true)
//            @RequestParam String WIDsubject,
////            @ApiParam(name="WIDtotal_amount",value="订单金额",required=true)
//            @RequestParam String WIDtotal_amount, HttpServletResponse response) throws UnsupportedEncodingException {
//        System.out.println("订单支付方法----------");
//        // 超时时间 可空
//        String timeout_express = "2m";
//        // 销售产品码 必填
//        String product_code = "QUICK_WAP_PAY";
//        /**********************/
//        // SDK 公共请求类，包含公共请求参数，以及封装了签名与验签，开发者无需关注签名与验签
//        // 调用RSA签名方式
//
////        AlipayClient client = new DefaultAlipayClient(alipayConfig.getGatewayUrl(),
////                alipayConfig.getAppId(), alipayConfig.getRsaPrivateKey(),
////                alipayConfig.getFormat(), alipayConfig.getCharset(),
////                alipayConfig.getAlipayPublicKey(), alipayConfig.getSignType());
//        AlipayClient client = new DefaultAlipayClient(AlipayConfig.GATEWAYURL,
//                AlipayConfig.APP_ID, AlipayConfig.MERCHANT_PRIVATE_KEY,
//                "json", AlipayConfig.CHARSET,
//                AlipayConfig.ALIPAY_PUBLIC_KEY, AlipayConfig.SIGN_TYPE);
//        AlipayTradeWapPayRequest alipay_request = new AlipayTradeWapPayRequest();
//
//        String no=new String(WIDout_trade_no.getBytes("ISO-8859-1"),"UTF-8");
//        String ject=new String(WIDsubject.getBytes("ISO-8859-1"),"UTF-8");
//        String amount=new String(WIDtotal_amount.getBytes("ISO-8859-1"),"UTF-8");
//        // 封装请求支付信息
//        AlipayTradeWapPayModel model = new AlipayTradeWapPayModel();
//        model.setOutTradeNo(no);
//        model.setSubject(ject);
//        model.setTotalAmount(amount);
//        model.setTimeoutExpress(timeout_express);
//        model.setProductCode(product_code);
//        alipay_request.setBizModel(model);
//        // 设置异步通知地址
//        alipay_request.setNotifyUrl(AlipayConfig.notify_url);
//        // 设置同步地址
//        alipay_request.setReturnUrl(AlipayConfig.return_url);
//        // form表单生产
//        String form = "";
//        try {
//            // 调用SDK生成表单
//
//            form = client.pageExecute(alipay_request).getBody();
//            System.out.println(form);
//            response.setContentType("text/html;charset="
//                    + AlipayConfig.CHARSET);
//            response.getWriter().write(AlipayConfig.APP_ID);
//            response.getWriter().write(form);// 直接将完整的表单html输出到页面
//            response.getWriter().flush();
//            response.getWriter().close();
//
//        } catch (AlipayApiException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//    }
//
////    /**
////     * app 订单支付
////     */
////    @GetMapping("getAppPagePay")
////    public ResultBO<?> getAppPagePay() throws Exception{
////        /** 模仿数据库，从后台调数据*/
////        String outTradeNo = "131233";
////        Integer totalAmount = 1000;
////        String subject = "天猫超市012";
////
////        String pay = alipayService.appPagePay(outTradeNo, totalAmount, subject);
////
////        Object json = JSONObject.toJSON(pay);
////
////        System.out.println(json);
////
////        return ResultTool.success(json);
////    }
//
////    /**
////     * 交易查询
////     */
////    @PostMapping("aipayQuery")
////    public ResultBO<?> alipayQuery() throws Exception{
////        /**调取支付订单号*/
////        String outTradeNo = "13123";
////
////        String query = alipayService.query(outTradeNo);
////
////        Object json = JSONObject.toJSON(query);
////
////        /*JSONObject jObject = new JSONObject();
////        jObject.get(query);*/
////        return ResultTool.success(json);
////    }
//
////    /**
////     * 退款
////     * @throws AlipayApiException
////     */
////    @GetMapping("alipayRefund")
////    public ResultBO<?> alipayRefund(
////            @RequestParam("outTradeNo")String outTradeNo,
////            @RequestParam(value = "outRequestNo", required = false)String outRequestNo,
////            @RequestParam(value = "refundAmount", required = false)Integer refundAmount
////    ) throws AlipayApiException{
////
////        /** 调取数据*/
////        //String outTradeNo = "15382028806591197";
////        String refundReason = "用户不想购买";
////        //refundAmount = 1;
////        //outRequestNo = "22";
////
////        String refund = alipayService.refund(outTradeNo, refundReason, refundAmount, outRequestNo);
////
////        System.out.println(refund);
////
////        return ResultTool.success(refund);
////    }
////
////    /**
////     * 退款查询
////     * @throws AlipayApiException
////     */
////    @PostMapping("refundQuery")
////    public ResultBO<?> refundQuery() throws AlipayApiException{
////
////        /** 调取数据*/
////        String outTradeNo = "13123";
////        String outRequestNo = "2";
////
////        String refund = alipayService.refundQuery(outTradeNo, outRequestNo);
////
////        return ResultTool.success(refund);
////
////    }
////
////    /**
////     * 交易关闭
////     * @throws AlipayApiException
////     */
////    @PostMapping("alipayclose")
////    public ResultBO<?> alipaycolse() throws AlipayApiException{
////
////        /** 调取数据*/
////        String outTradeNo = "13123";
////
////        String close = alipayService.close(outTradeNo);
////
////        return ResultTool.success(close);
////    }
//}
