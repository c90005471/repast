package com.aaa.repast.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author aaaTeacher 20190411
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@MapperScan("com.aaa.repast.admin.project.*.*.mapper")
//@EnableCaching
public class RepastApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(RepastApplication.class, args);
    }
}