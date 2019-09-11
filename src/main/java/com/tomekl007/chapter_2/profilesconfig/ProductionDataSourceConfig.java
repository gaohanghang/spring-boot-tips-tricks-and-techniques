package com.tomekl007.chapter_2.profilesconfig;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * 生产环境数据源配置
 */
@Component
// @Profile 条件化 bean.  使用 Profile 的例子：开发环境使用 H2 数据库，线上环境使用 MySql 数据库
@Profile("prod")
public class ProductionDataSourceConfig implements DataSourceConfig {
    @Override
    public void setup() {
       System.out.println("Setting up dataSource for PRODUCTION environment. ");
    }
}
