package cn.jyd.dubbo.provider;

import com.alibaba.dubbo.config.annotation.Service;

import cn.jyd.dubbo.dao.ShopDao;
import cn.jyd.dubbo.entity.Shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
 
@Service(interfaceClass = ShopApi.class)
@Component
public class ShopHandler implements ShopApi {
 
    @Autowired
    private ShopDao shopDao;

    @Override
    public Shop get(Long pk) {
        Shop shop = shopDao.selectByPrimaryKey(pk);
        return shop;
    }

}
