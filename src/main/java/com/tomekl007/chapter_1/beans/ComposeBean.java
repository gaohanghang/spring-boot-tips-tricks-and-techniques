package com.tomekl007.chapter_1.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComposeBean {
  // Spring is taking care of lifecycle of all components
  // We don't need to worry about initialization order;
  // Spring负责所有组件的生命周期
  // 我们不需要担心初始化顺序;

  // 组合父类bean
  private final ParentBean parentBean;

  @Autowired
  public ComposeBean(ParentBean parentBean) {
    this.parentBean = parentBean;
  }
}
