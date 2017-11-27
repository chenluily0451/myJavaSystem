package com.my.system.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
@EnableWebMvc
@ComponentScan("com.my.system")
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/files/**").addResourceLocations("file:./files/");
        registry.addResourceHandler("/scripts/**").addResourceLocations("file:./src-web/app/scripts/");
        registry.addResourceHandler("/images/**").addResourceLocations("file:./src-web/app/images/");
        registry.addResourceHandler("/styles/**").addResourceLocations("file:./src-web/app/styles/");
    }


//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("").setViewName("/index");
//        registry.addViewController("/").setViewName("/index");
//        registry.addViewController("/index").setViewName("/index");
//        registry.addViewController("/upload").setViewName("/upload");
//    }

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        configurer.setUseSuffixPatternMatch(false);
    }
}