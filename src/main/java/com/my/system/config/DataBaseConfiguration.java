package com.my.system.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = {"com.my.system.mapper"})
public class DataBaseConfiguration {



}
