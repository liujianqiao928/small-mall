package pc.small.service.impl;

import cn.hutool.core.util.StrUtil;
import mall.model.Shop;
import mall.tip.FinalTip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pc.small.dto.ResultDto;
import pc.small.dto.ShopDto;
import pc.small.mapper.ShopCarDao;
import pc.small.mapper.ShopDao;
import pc.small.mapper.ShopTypeDao;
import pc.small.mapper.TuserDao;
import pc.small.service.ShopCarService;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
@Service
@Transactional
public class ShopCarServiceImpl implements ShopCarService {
    @Autowired
    private ShopDao shopDao;
    @Autowired
    private ShopTypeDao shopTypeDao;
    @Autowired
    private ShopCarDao shopCarDao;
    @Autowired
    private TuserDao tuserDao;
    @Override
    public List<ShopDto> findCar(String shopcarid) {
        String ids = shopCarDao.findByIds(shopcarid);
        String[] split = ids.split(",");
        List<ShopDto> res =findByShopId(split);
        return res;
    }

    @Override
    public ResultDto addCar(HttpSession session, String id, String s) {
        ResultDto resultDto = new ResultDto();
        if (StrUtil.isEmpty(id)){
            resultDto.setCode(400);
            resultDto.setMsg(FinalTip.FINDNOTSHOP);
            return resultDto;
        }
        String byIds = shopCarDao.findByIds(s);
        String[] split = byIds.split(",");
        for (String s1 : split) {
            if (id.equals(s1)){
                resultDto.setCode(400);
                resultDto.setMsg(FinalTip.SHOPCF);
                return resultDto;
            }
        }
        int r =split.length;
        byIds=byIds+","+id;

       Integer res =shopCarDao.UpdataCar(byIds,s);
       if (res == 0){
           resultDto.setMsg("加入购物车失败");
           return resultDto;
       }
       r++;
      Integer sc = shopCarDao.UpdataCount(s);
      Integer ts = tuserDao.UpdataShopCount(r,s);
       resultDto.setCode(200);
       resultDto.setMsg("加入购物车成功");

        return resultDto;
    }

    @Override
    public ResultDto del(HttpSession session, String shopcarid, String id) {
        ResultDto resultDto = new ResultDto();
        if (StrUtil.isEmpty(shopcarid)){
            resultDto.setCode(400);
            resultDto.setMsg(FinalTip.FINDNOTSHOP);
            return resultDto;
        }
        System.out.println(shopcarid);
        System.out.println(id);
        String byIds = shopCarDao.findByIds(id);
        System.out.println(byIds);
        String[] split = byIds.split(",");
        String news ="";
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals(shopcarid)){
                continue;
            }else {
                if(i==0){
                    news += split[i];

                }else {
                    news +=","+split[i];
                }
            }


        }
        System.out.println(news);
        Integer integer = shopCarDao.UpdataCar(news, id);
        if (integer == 0){
            resultDto.setCode(400);
            resultDto.setMsg("删除失败");
            return resultDto;
        }
        resultDto.setCode(200);
        resultDto.setMsg("删除成功 请刷新");
        return resultDto;
    }

    private List<ShopDto> findByShopId(String[] shopcarid) {
        List<ShopDto> list= new ArrayList<>();
        for (String s : shopcarid) {
            ShopDto shopDto = new ShopDto();
            Shop byId = shopDao.findById(s);
            shopDto.setShopid(byId.getShopid());
            shopDto.setShoptitle(byId.getShoptitle());
            shopDto.setShopxprice(byId.getShopxprice());
            String name=shopTypeDao.findById(byId.getShoptype());
            shopDto.setTypename(name);
            shopDto.setShopyprice(byId.getShopyprice());
            shopDto.setShopimg(byId.getShopimg());
            shopDto.setShopbaozhuang(byId.getShopbaozhuang());

            list.add(shopDto);

        }


        return list;
    }
}
