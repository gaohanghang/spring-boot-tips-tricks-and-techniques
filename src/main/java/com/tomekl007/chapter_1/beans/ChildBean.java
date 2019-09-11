package com.tomekl007.chapter_1.beans;

import org.springframework.stereotype.Component;

/**
 * 在继承上偏爱Spring组件的组合
 */
@Component
public class ChildBean extends ParentBean {
  // we need to worry about lifecycle of ParentBean and ChildBean
  // 我们需要担心ParentBean和ChildBean的生命周期

  @Override
  public void action() {
    System.out.println("Action from ChildBean");
  }
}
