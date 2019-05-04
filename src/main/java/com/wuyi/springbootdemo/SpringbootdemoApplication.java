package com.wuyi.springbootdemo;

//import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;


//@EnableScheduling
//@EnableAsync
// (scanBasePackages = {"com.wuyi.springbootdemo"})
@SpringBootApplication
@MapperScan("com.wuyi.springbootdemo.dao")
//@ComponentScan(basePackages = "com.wuyi.springbootdemo.dao")
public class SpringbootdemoApplication {

    public static void main(String[] args) {
//        System.out.println("主程序进入");
        SpringApplication.run(SpringbootdemoApplication.class, args);
    }

}
