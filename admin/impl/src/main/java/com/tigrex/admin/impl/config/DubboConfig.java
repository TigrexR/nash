package com.tigrex.admin.impl.config;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;

/**
 * @author linus
 */
@Configuration
@EnableDubbo
@DubboComponentScan(basePackages = {"com.tigrex.admin.impl.service.impl"})
public class DubboConfig {
}
