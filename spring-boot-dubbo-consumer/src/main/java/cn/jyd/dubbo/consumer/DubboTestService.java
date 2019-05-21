package cn.jyd.dubbo.consumer;

import cn.jyd.dubbo.entity.Shop;
import cn.jyd.dubbo.service.ShopApi;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;

@Component
public class DubboTestService {
	
	@Reference(version="2.0.0")
    private ShopApi shopApi;

    public Shop get(Long pk){
		return shopApi.get(pk);      
    }
}