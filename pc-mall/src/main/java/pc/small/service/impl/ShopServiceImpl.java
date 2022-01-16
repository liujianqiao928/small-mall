package pc.small.service.impl;

import mall.model.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pc.small.dto.ResultDto;
import pc.small.mapper.*;
import pc.small.service.ShopService;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopTypeDao shopTypeDao;
    @Autowired
    private ShopDao shopDao;
    @Autowired
    private OneDao oneDao;
    @Autowired
    private TwoDao twoDao;
    @Autowired
    private ThreeDao threeDao;
    @Override
    public List<Shop> findByType(String type) {
        String buTypeName = shopTypeDao.findBuTypeName(type);
       List<Shop> res= shopDao.findByType(buTypeName);
        return res;
    }

    @Override
    public List<Shop> findBySelectType(String jiu) {
        String buTypeName = shopTypeDao.findBuTypeName(jiu);
        String byName = oneDao.findByName(jiu);
        String byName1 = twoDao.findByName(jiu);
        String byName2 = threeDao.findByName(jiu);
        List<Shop> bySelectType = shopDao.findBySelectType(buTypeName, byName, byName1, byName2);

        return bySelectType;
    }

    @Override
    public List<Shop> selectType(String type) {
        String buTypeName = shopTypeDao.findBuTypeName(type);
        List<Shop> buTypeName1 = shopDao.findBySelectType(buTypeName,null,null,null);
        return buTypeName1;
    }

    @Override
    public Shop findById(String id) {
      Shop shop =   shopDao.findById(id);
        return shop;
    }

    @Override
    public List<String> findlikeType(String serchtext) {

    List<String> res=   shopDao.findLikeTitle(serchtext);
        return res;
    }

    @Override
    public List<Shop> findByLike(String serchtext) {
        List<String> ids=shopDao.findLikeAll(serchtext);
        List<Shop> res = new ArrayList<>();
        for (String id : ids) {
            Shop byId = shopDao.findById(id);
            res.add(byId);
        }

        return res;
    }

    @Override
    public ResultDto checkkucun(String id) {
        ResultDto resultDto = new ResultDto();
        Integer res = shopDao.checkshopcount(id);
        if (res <1){
            resultDto.setCode(400);
            resultDto.setMsg("库存不足,请联系卖家");
            return resultDto;
        }
        resultDto.setCode(200);
        return resultDto;
    }
}
