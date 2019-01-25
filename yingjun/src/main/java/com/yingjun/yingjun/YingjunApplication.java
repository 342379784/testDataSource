package com.yingjun.yingjun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 这是一个练习mysql主从复制读写分离的demo
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class YingjunApplication {

    public static void main(String[] args) {
        SpringApplication.run(YingjunApplication.class, args);
    }

}

