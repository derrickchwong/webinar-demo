package com.example.webinardemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@springfox.documentation.swagger2.annotations.EnableSwagger2
public class SwaggerConfig {
    @Bean
    public springfox.documentation.spring.web.plugins.Docket api() {
        return new springfox.documentation.spring.web.plugins.Docket(springfox.documentation.spi.DocumentationType.SWAGGER_2)
                .select()
                .apis(springfox.documentation.builders.RequestHandlerSelectors.any())
                .paths(springfox.documentation.builders.PathSelectors.any())
                .build();
    }
}