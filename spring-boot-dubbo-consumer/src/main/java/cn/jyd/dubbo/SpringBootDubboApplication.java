package cn.jyd.dubbo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;

import cn.jyd.dubbo.consumer.DubboTestService;
import cn.jyd.dubbo.entity.Shop;

@EnableDubboConfiguration
@SpringBootApplication
@RestController
public class SpringBootDubboApplication {

	@Autowired
	private DubboTestService dubboTestService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDubboApplication.class, args);
	}

	
	@RequestMapping(value = "/")
	public String hello(){
		Shop shop = dubboTestService.get(1L);
		return "hello "+ shop.getId()+": NAME : "+shop.getName();
	}

}

