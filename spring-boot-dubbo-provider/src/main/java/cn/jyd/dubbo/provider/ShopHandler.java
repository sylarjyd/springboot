package cn.jyd.dubbo.provider;

import com.alibaba.dubbo.config.annotation.Service;

import cn.jyd.dubbo.dao.ShopDao;
import cn.jyd.dubbo.entity.Shop;
import cn.jyd.dubbo.service.ShopApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
 
@Service(interfaceClass = ShopApi.class,version = "2.0.0")
@Component
public class ShopHandler implements ShopApi {
 
    @Autowired
    private ShopDao shopDao;
    
    @Autowired  
    private Environment env;  
    
    @Override
    public Shop get(Long pk) {
        Shop shop = shopDao.selectByPrimaryKey(pk);
        String id = env.getProperty("spring.dubbo.application.id");
        System.out.println(id);
        return shop;
    }

}
