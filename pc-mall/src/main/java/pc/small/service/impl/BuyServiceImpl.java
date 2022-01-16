package pc.small.service.impl;

import mall.model.Shop;
import mall.model.Tuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pc.small.dto.ResultDto;
import pc.small.dto.ShopDto;
import pc.small.mapper.ShopDao;
import pc.small.mapper.ShopTypeDao;
import pc.small.mapper.TuserDao;
import pc.small.service.BuyService;

@Service
public class BuyServiceImpl implements BuyService {
    @Autowired
    private ShopDao shopDao;
    @Autowired
    private ShopTypeDao shopTypeDao;
    @Autowired
    private TuserDao tuserDao;
    @Override
    public ShopDto getBuy(String id, String id1) {
        ShopDto shopDto = new ShopDto();
        Tuser tuser = tuserDao.reLogin(id1);
        shopDto.setTuser(tuser);
        Shop byId = shopDao.findById(id);
        shopDto.setShopid(byId.getShopid());
        shopDto.setShoptitle(byId.getShoptitle());
        shopDto.setShopyprice(byId.getShopyprice());
        shopDto.setShopxprice(byId.getShopxprice());
        shopDto.setShopimg(byId.getShopimg());
        shopDto.setShopbaozhuang(byId.getShopbaozhuang());
        String byId1 = shopTypeDao.findById(byId.getShoptype());
        shopDto.setTypename(byId1);
        return shopDto;
    }

    @Override
    public ResultDto checkMoney(String id, String id1) {
        ResultDto resultDto = new ResultDto();
        String shopMoney= shopDao.checkMoney(id);
        String userMoney= tuserDao.checkMoney(id1);
        if (Double.parseDouble(shopMoney) > Double.parseDouble(userMoney)){
            resultDto.setCode(400);
            resultDto.setMsg("余额不足,请尽快充值");
            return resultDto;
        }
        resultDto.setCode(200);
        return resultDto;
    }
}
