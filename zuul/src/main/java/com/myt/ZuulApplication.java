package com.myt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @program: springcloud
 * @description:
 * @author: Ma YaTing
 * @create: 2020-11-06 09:03
 */
@EnableZuulProxy //生成网关代理
@EnableAutoConfiguration //自动装载配置
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}
