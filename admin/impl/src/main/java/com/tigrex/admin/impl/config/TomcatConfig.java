package com.tigrex.admin.impl.config;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author linus
 */
@Configuration
public class TomcatConfig {

    @Bean(name = "tomcatServletWebServer")
    public ServletWebServerFactory tomcatServletWebServer(){
        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
        tomcat.setProtocol("org.apache.coyote.http11.Http11Nio2Protocol");
        return tomcat;
    }

}
