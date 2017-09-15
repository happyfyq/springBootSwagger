package com.ideal.znyx.springBootSwagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication  等价于（@EnableAutoConfiguration+@ComponentScan("cn.mldn.microboot")）
 */
@SpringBootApplication
public class SpringBootMainApplication {
  
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootMainApplication.class, args);
    }
}