package com.tigrex.admin.impl.web.config;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;

/**
 * @author linus
 */
@Configuration
@EnableDubbo
@DubboComponentScan(basePackages = {"com.tigrex.web.controller"})
public class DubboConfig {
}
