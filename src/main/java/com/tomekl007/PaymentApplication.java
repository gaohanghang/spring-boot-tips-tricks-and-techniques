package com.tomekl007;

import com.tomekl007.payment.api.PaymentService;
import io.prometheus.client.CollectorRegistry;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.endpoint.PublicMetrics;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.metrics.export.prometheus.EnablePrometheusMetrics;
import org.springframework.metrics.instrument.prometheus.PrometheusMeterRegistry;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@SpringBootApplication
@EnableAspectJAutoProxy
@EnableHystrix
@EnablePrometheusMetrics
public class PaymentApplication {
    @Autowired(required = false)
    PaymentService paymentService;

    public static void main(String[] args) {
        //you can use -Dspring.profiles.active=dev when starting app instead of hardcoding it
        //启动应用程序而不是硬编码时，可以使用-Dspring.profiles.active = dev
        System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "dev");

        SpringApplication.run(PaymentApplication.class, args);
    }


    //this is instead of XML based config
    //这不是基于XML的配置
    @Bean
    // @ConditionalOnMissingBean注解作用在@bean定义上，它的作用就是在容器加载它作用的bean时，检查容器中是否存在目标类型（ConditionalOnMissingBean注解的value值）的bean了，如果存在这跳过原始bean的BeanDefinition加载动作。
    @ConditionalOnMissingBean
    CollectorRegistry collectorRegistry() {
        CollectorRegistry collectorRegistry = new CollectorRegistry();
        return collectorRegistry;
    }

    @Bean
    @Primary
    PrometheusMeterRegistry meterRegistry() {
        return new PrometheusMeterRegistry(collectorRegistry());
    }

    static {
        //HACK Avoids duplicate metrics registration in case of Spring Boot dev-tools restarts
        // HACK避免在Spring Boot dev-tools重启时重复的指标注册
        CollectorRegistry.defaultRegistry.clear();
    }

}
