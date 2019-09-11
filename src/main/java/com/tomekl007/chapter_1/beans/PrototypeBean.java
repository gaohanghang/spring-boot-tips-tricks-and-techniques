package com.tomekl007.chapter_1.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
// prototype：原型模式，每次通过容器的getBean方法获取prototype定义的Bean时，都将产生一个新的Bean实例
public class PrototypeBean {

  public PrototypeBean() {
    System.out.println("constructor of PrototypeBean");
  }
}
