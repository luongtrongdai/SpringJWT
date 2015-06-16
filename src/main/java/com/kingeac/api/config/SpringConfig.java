package com.kingeac.api.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@EnableAutoConfiguration
@ImportResource({"classpath:spring-config.xml"})
public class SpringConfig {
	public SpringConfig() {
        super();
    }
}
