package com.ideal.znyx.springBootSwagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2 {
    /**
     * 创建API应用
     * apiInfo() 增加API相关信息
     * 通过select()函数返回一个ApiSelectorBuilder实例,用来控制哪些接口暴露给Swagger来展现，
     * 本例采用扫描任意的文件，如果需要自定义需要扫描的文件，可以 ：.apis(RequestHandlerSelectors.basePackage("com.swaggerTest.controller"))
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }
    
    //对于这个APIs的一个介绍和一些相关的基础信息的描述
    //访问地址：http://项目实际地址/swagger-ui.html
     private ApiInfo apiInfo() {
          return new ApiInfoBuilder()
                  .title("Spring Boot中使用Swagger2构建RESTful APIs")
                  .description("更多Spring Boot相关文章请关注：http://happywayq.com/")
                  .termsOfServiceUrl("http://happywayq.com/")
                  .contact("叫我DaMiss")
                  .version("1.0")
                  .build();
      }
}