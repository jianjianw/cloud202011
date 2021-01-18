package org.opengg.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.opengg.springcloud.entities.CommonResult;
import org.opengg.springcloud.entities.Payment;
import org.opengg.springcloud.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult<Integer> create(Payment payment) {
        int i = paymentService.create(payment);
        log.info("i:"+i);
        if(i>0){
            return new CommonResult(200,"插入成功",i);
        }else{
            return new CommonResult(400,"插入失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("payment:"+payment);
        System.out.println("hhddda");
        if(payment != null){
            return new CommonResult(200,"查询成功成功",payment);
        }else{
            return new CommonResult(400,"查询失败，没有知道响应记录："+id,null);
        }
    }
}
