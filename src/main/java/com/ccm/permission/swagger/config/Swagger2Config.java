package com.ccm.permission.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean(name = "createRestfulApi")
    public Docket createRestfulApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(""))
                .paths(PathSelectors.any())
                .build();
    }

    //接口相关信息
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("肿瘤个案管理系统中使用Swagger2构建RESTful接口")
                .description("接口描述")
                .termsOfServiceUrl("termsOfServiceUrl")
                .contact(new Contact("@lizhen","","lizhen_init@163.com"))
                .version("1.0")
                .license("http://springfox.github.io/springfox/docs/current/")
                .licenseUrl("http://springfox.github.io/springfox/docs/current/")
                .build();
    }

}
