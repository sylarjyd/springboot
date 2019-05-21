package cn.jyd.dubbo.dao;

import java.util.UUID;

import org.springframework.stereotype.Component;

import cn.jyd.dubbo.entity.Shop;

@Component(value="shopDao")
public class ShopDao {
	
	public Shop selectByPrimaryKey(Long pk) {
		return new Shop(String.valueOf(pk),UUID.randomUUID().toString());		
	}

}
