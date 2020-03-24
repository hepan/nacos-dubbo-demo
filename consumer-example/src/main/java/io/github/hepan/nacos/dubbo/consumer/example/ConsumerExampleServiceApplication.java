package io.github.hepan.nacos.dubbo.consumer.example;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author hp
 * @describe
 * @createTime 2020/3/24 14:29
 **/
@SpringBootApplication
@EnableDubbo
public class ConsumerExampleServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerExampleServiceApplication.class);
    }
}
