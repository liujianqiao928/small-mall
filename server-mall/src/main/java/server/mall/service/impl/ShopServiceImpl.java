package server.mall.service.impl;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.StrUtil;
import mall.model.Shop;
import mall.model.view.ShopMangerView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import server.mall.dto.AddDto;
import server.mall.dto.ResultDto;
import server.mall.dto.ShopDto;
import server.mall.mapper.*;
import server.mall.service.ShopService;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopDao shopDao;
    @Autowired
    private ShopTypeDao shopTypeDao;

    @Autowired
    private ShopMangerViewDao shopMangerViewDao;
    @Override
    public List<ShopDto> findAll() {
        List<ShopDto> list = new ArrayList<>();
        List<ShopMangerView> all = shopMangerViewDao.findAll();
        for (ShopMangerView f : all) {
            ShopDto shopDto = new ShopDto();
            shopDto.setShopid(f.getShopid());
            shopDto.setShoptitle(f.getShoptitle());
            shopDto.setShopprice(f.getShopxprice());
            shopDto.setIshen(f.getIsupjia() == 1 ? "已上架" : "审核中");
            if (!StrUtil.isEmpty(shopTypeDao.findById(
                    f.getFlname())))
                shopDto.setTypename(f.getFlname());
            else
                shopDto.setTypename("当前没有分类");
            if (!StrUtil.isEmpty(f.getOname()))
                shopDto.setOntname(f.getOname());
            else
                shopDto.setOntname("当前没有分类");
            if (!StrUtil.isEmpty(f.getTwname()))
                shopDto.setTwoname(f.getTwname());
            else
                shopDto.setTwoname("当前没有分类");
            list.add(shopDto);
        }
        return list;
    }

    @Override
    public ResultDto add(AddDto addDto, String id) {
        ResultDto resultDto = new ResultDto();
        if (StrUtil.isBlank(addDto.getProname())){
            resultDto.setCode(400);
            resultDto.setMsg("您的商品名称为空");
            return resultDto;
        }
        Shop shop = new Shop();
        String replace = UUID.randomUUID().toString().replace("-", "");
        shop.setShopid(replace);
        shop.setCommcount("999");
        String now = DateUtil.now();
        shop.setCreate(now);
        shop.setIscomm(addDto.getDis().equals("是")?1 : 0);
        shop.setIsziying(1);
        shop.setIsupjia(addDto.getOn().equals("是")?1 : 0);
        shop.setSimpledesc(addDto.getSimpledesc());
        shop.setShoptitle(addDto.getProname());
        shop.setShopkey(addDto.getKeyword());
        shop.setSellcount(0);
        shop.setPertmers("1");
        shop.setShopdesc(addDto.getShopdesc());
        shop.setShopgg(addDto.getShopgg());
        shop.setShopcount(Integer.valueOf(addDto.getShopcount()));
        shop.setShopxprice(addDto.getShopxprice());
        shop.setOtherimg("1");
        shop.setShopyprice(addDto.getShopyprice());
        MultipartFile shopimg = addDto.getShopimg();
        String i = "D:\\img\\";
        String r =shopimg.getOriginalFilename().substring(shopimg.getOriginalFilename().lastIndexOf("."),shopimg.getOriginalFilename().length());
        try {
            shopimg.transferTo(new File(i+replace+r));
            shop.setShopimg(i+replace+r);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String buTypeName = shopTypeDao.findBuTypeName(addDto.getType());
        if (StrUtil.isBlank(buTypeName)){
            while (true){
                try {
                    int i1 = RandomUtil.randomInt(100, 10000);
                    shopTypeDao.add(String.valueOf(i1),addDto.getType());
                    shop.setShoptype(String.valueOf(i1));
                    break;
                }catch (Exception e){
                    e.printStackTrace();
                    continue;

                }
            }

        }
        shop.setShopfl("1");
        shop.setSellcount(0);
        shop.setShopbaozhuang("盒装");
        shop.setOnefl("1");
        shop.setTwofl("1");
        shop.setThreefl("1");
        shop.setAuserid(id);
       Integer res =  shopDao.add(shop);
       if (res == 0){
           resultDto.setCode(400);
           resultDto.setMsg("添加失败");
           return resultDto;
       }
        resultDto.setCode(200);
        resultDto.setMsg("添加成功");
        return resultDto;
    }
}
