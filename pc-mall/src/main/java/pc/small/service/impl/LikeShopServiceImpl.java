package pc.small.service.impl;

import mall.model.LikeShop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pc.small.mapper.LikeShopDao;
import pc.small.service.LikeShopService;

import java.util.List;
@Service
public class LikeShopServiceImpl implements LikeShopService {
    @Autowired
    private LikeShopDao likeShopDao;
    @Override
    public List<LikeShop> findAll() {
        return likeShopDao.findAll();
    }
}
