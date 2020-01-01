package com.wxj.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author wangxinji
 */
@ComponentScan("com.wxj.controller")
@EnableAutoConfiguration
public class App {
    //先用扫包的启动方式
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
