package com.example.times;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.servlet.MultipartConfigElement;

@MapperScan("com.example.times.dao")
@SpringBootApplication
@EnableSwagger2
public class TimesApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(TimesApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(TimesApplication.class);
	}
	/**
	 * 文件上传路径
	 */

	@Bean
	MultipartConfigElement multipartConfigElement(){
		MultipartConfigFactory factory = new MultipartConfigFactory();
		factory.setLocation("/");
		return factory.createMultipartConfig();
	}
//	/**
//	 *扫描mapper
//	 */
//	@Bean
//	public MapperScannerConfigurer getBeanMSC(){
//		MapperScannerConfigurer msc = new MapperScannerConfigurer();
//		msc.setBasePackage("com.example.times.dao");
//		msc.setAnnotationClass(Mapper.class);
//		return msc;
//	}
}
