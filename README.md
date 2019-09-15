# Spring-Boot-Tips-Tricks-and-Techniques

> Spring Boot: Tips, Tricks and Techniques [Video], published by Packt
>
> Spring Boot 提示，技巧和技术[视频]，由Packt出版

## 1 Spring依赖注入技巧

### 1.1 课程概述

### 1.2 避免常见DI陷阱-字段注入

com.tomekl007.chapter_1.PitfallFieldInjection

### 1.3 在构造函数注入使用不可变字段

com.tomekl007.chapter_1.ConstructorInjection

### 1.4 使用Bean @Qualifier避免Bean的运行时冲突

com.tomekl007.chapter_1.AvoidRuntimeClash

### 1.5利用 Beans Scope 避免不必要的创作

com.tomekl007.chapter_1.UsingScope

### 1.6 继承优于组合

com.tomekl007.chapter_1.beans.ComposeBean

## 2 在Spring Boot中使用Spring配置和配置文件

### 2.1 用编程配置替换基于XML的Bean配置

com.tomekl007.PaymentApplication

### 2.2 在细粒度@Configuration组件中分离配置

com.tomekl007.chapter_2.SpecificServiceSettings

### 2.3 使用配置文件进行每个环境的配置

application-dev.yml

com.tomekl007.chapter_2.profilesconfig.DevDataSourceConfig

com.tomekl007.chapter_2.profilesconfig.ProductionDataSourceConfig

### 2.4 了解使用Spring继承yml配置

application-dev.yml

com.tomekl007.chapter_2.ConfigInheritance

## 3 使用Spring设计REST API时的最佳实践

### 避免从DB层泄漏实体到API - 介绍DTO

com.tomekl007.chapter_3.domain.PaymentDto

### 定义端点 - 在@GetMapping和@RequestMapping之间进行选择

### 利用带有@RequestBody注释的Spring自动转换

使用 @RequestBody 将 json 转换为对象

### 实现将异常传播给调用者的API

![](https://raw.githubusercontent.com/gaohanghang/images/master/img/20190915133311.png)

### 创建使用REST播放的API - 将异常映射到HTTP代码

将异常映射到正确的REST错误代码

![](https://raw.githubusercontent.com/gaohanghang/images/master/img/20190915133831.png)

## 4 编写高性能的Spring Boot Starters

### 创建一个扩展Spring Eco-System的Spring Boot Starter项目

### 配置由我们的入门者管理的Spring Bean - 定义API


## 5 使用Spring Boot进行测试的技术更加维护

### 避免Spring Boot测试反模式：实时测试

### 用完全成熟的集成测试取代实时测试

### 使用MockMVC加速MVC测试

![](https://raw.githubusercontent.com/gaohanghang/images/master/img/20190915135029.png)

### 通过模拟安全上下文使测试安全性变得简单

com.tomekl007.chapter_5.MVCControllerSecurityTest

### 我们将仅选择所需的bean，以使您的测试更易于维护。

## 6 设计Spring Boot和容错性

### 为RestTemplate配置套接字和请求超时

### 根据客户端微服务分离RestTemplates。

### 用断路器逻辑防止故障

### 在下游服务失败的情况下使用RetryTemplate重试

com.tomekl007.chapter_6.retry.RetryTemplateConfiguration

## 7 让您的Spring应用程序可维护的技巧

### 配置Spring记录以避免使用嘈杂的记录器

log4j.properties

### 使用Micrometer测量应用程序中使用的缓存，以避免内存泄漏。

### 使用直方图控制端点响应时间

### 通过Prometheus公开指标来构建围绕它们的监控

![](https://raw.githubusercontent.com/gaohanghang/images/master/img/20190915142249.png)
