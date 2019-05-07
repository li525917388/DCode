package com.ldh.dcode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value={"com.ldh.dcode.dao"})
@SpringBootApplication
public class AppMain {

	/**
	 * 项目启动类
	 * @param args
	 */
	public static void main(String[] args) {
		
		SpringApplication.run(AppMain.class, args);
	}
}
