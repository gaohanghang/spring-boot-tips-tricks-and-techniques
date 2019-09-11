package com.tomekl007.chapter_1;


import com.tomekl007.payment.api.PaymentService;
import com.tomekl007.chapter_3.domain.Payment;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 依赖注入陷阱
 */
//@Component
public class PitfallFieldInjection {

  @Autowired
  private PaymentService paymentService;

  /**
   * 构造函数调用依赖注入的对象会报错
   * 因为 构造函数要先于依赖注入
   */
  private PitfallFieldInjection(){
    paymentService.pay(new Payment());//problem!!
  }

}
