package com.tomekl007.chapter_1.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// Scope，也称作用域，在 Spring IoC 容器是指其创建的 Bean 对象相对于其他 Bean 对象的请求可见范围。
// 在 Spring IoC 容器中具有以下几种作用域：基本作用域（singleton、prototype），Web 作用域（reqeust、session、globalsession），自定义作用域。
// singleton：单例模式，在整个Spring IoC容器中，使用singleton定义的Bean将只有一个实例
@Scope("singleton")
public class SingletonBean {
  public SingletonBean() {
    System.out.println("constructor of SingletonBean");
  }
}
