package cn.jyd.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;

@EnableDubboConfiguration
@SpringBootApplication
public class SpringBootDubboApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDubboApplication.class, args);
	}

}

