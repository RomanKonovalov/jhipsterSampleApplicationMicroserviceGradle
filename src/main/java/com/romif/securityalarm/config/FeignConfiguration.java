package com.romif.securityalarm.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.romif.securityalarm")
public class FeignConfiguration {

}
