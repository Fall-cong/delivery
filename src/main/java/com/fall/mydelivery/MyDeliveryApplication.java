package com.fall.mydelivery;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author : fall
 * @date : 2022-08-04 16:18
 * @className : MyDeliveryApplication
 * @description: description
 */

@Slf4j
@SpringBootApplication
@ServletComponentScan
public class MyDeliveryApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyDeliveryApplication.class,args);
        log.info("项目启动成功");
    }
}
