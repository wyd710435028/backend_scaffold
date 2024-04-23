package com.backend_scaffold.global.config;

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
public class SwaggerConfig {

    @Bean
    public Docket docket() {
        // 创建一个 swagger 的 bean 实例
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select().
                apis(RequestHandlerSelectors.basePackage("com.backend_scaffold"))
                .paths(PathSelectors.any())
                .build();
    }

    // 基本信息设置
    private ApiInfo apiInfo() {
        Contact contact = new Contact(
                "WYD", // 作者姓名
                "https://blog.csdn.net/qq_43093003", // 作者网址
                "15732116536@163.com"); // 作者邮箱
        return new ApiInfoBuilder()
                .title("后端脚手架-接口文档") // 标题
                .description("基于swagger生成的接口文档") // 描述
                .termsOfServiceUrl("https://www.baidu.com") // 跳转连接
                .version("1.0") // 版本
                .license("许可证")
                .licenseUrl("https://blog.csdn.net/qq_43093003")
                .contact(contact)
                .build();
    }

}
