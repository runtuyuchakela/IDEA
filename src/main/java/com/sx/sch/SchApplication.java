package com.sx.sch;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sx.sch.dao")
public class SchApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchApplication.class, args);
    }

}
