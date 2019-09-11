package com.tomekl007.chapter_2;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 有时候有这样子的情景，我们想把配置文件的信息，读取并自动封装成实体类，
 * 这样子，我们在代码里面使用就轻松方便多了，
 * 这时候，我们就可以使用@ConfigurationProperties，它可以把同类的配置信息自动封装成实体类
 */
@Component
@ConfigurationProperties(prefix = "service-config")
public class SpecificServiceSettings {
  private Integer a;
  private String b;

  public Integer getA() {
    return a;
  }

  public void setA(Integer a) {
    this.a = a;
  }

  public String getB() {
    return b;
  }

  public void setB(String b) {
    this.b = b;
  }

  @Override
  public String
  toString() {
    return "SpecificServiceSettings{" +
        "a=" + a +
        ", b='" + b + '\'' +
        '}';
  }
}
