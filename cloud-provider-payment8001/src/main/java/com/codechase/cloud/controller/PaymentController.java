package com.codechase.cloud.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codechase.cloud.entities.CommonResult;
import com.codechase.cloud.entities.Payment;
import com.codechase.cloud.service.PaymentService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author chenxin09 <chenxin09@kuaishou.com>
 * Created on 2021-04-11
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    // 我们后端内部的业务逻辑,都是直接使用Payment等实体类直接用,最后Controller给前端返回的一定是通用的Result
    public CommonResult create(Payment payment){
        int result = paymentService.create(payment);
        log.info("*****插入结果: " + result);

        if(result > 0){
            return new CommonResult(200,"插入数据库成功",result);
        }else{
            return new CommonResult(444,"插入数据库失败",null);
        }
    }
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id)
    {
        Payment payment = paymentService.getPaymentById(id);

        if(payment != null)
        {
            return new CommonResult(200,"查询成功",payment);
        }else{
            return new CommonResult(444,"没有对应记录,查询ID: "+id,null);
        }
    }
}
