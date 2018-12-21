package com.ccm.permission.swagger;//package com.ccm.permission.swagger.config;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
////@Configuration
////@EnableSwagger2
//public class Swagger2Config {
//
//    //是否开启swagger,生产环境一般是需要关闭的，可根据springboot的多环境配置进行设置
//    @Value(value = "${swagger.enabled}")
//    Boolean swaggerEnabled;
//
//    @Bean(name = "createRestfulApi")
//    public Docket createRestfulApi(){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .enable(swaggerEnabled)//是否开启
//                .select()
//                .apis(RequestHandlerSelectors.basePackage(""))//扫描的路径包
//                .paths(PathSelectors.any())//指定路径处理(PathSelectors.any()代表所有路劲)
//                .build()
//                .pathMapping("/");
//    }
//
//    //接口相关信息
//    private ApiInfo apiInfo(){
//        return new ApiInfoBuilder()
//                .title("肿瘤个案管理系统中使用Swagger2构建RESTful接口")
//                .description("接口描述 springboot | swagger2集成")
//                .termsOfServiceUrl("termsOfServiceUrl")
//                .contact(new Contact("@lizhen","暂无","lizhen_init@163.com"))//作者信息
//                .version("1.0")
//                .license("http://springfox.github.io/springfox/docs/current/")
//                .licenseUrl("http://springfox.github.io/springfox/docs/current/")
//                .build();
//    }
//
//}
