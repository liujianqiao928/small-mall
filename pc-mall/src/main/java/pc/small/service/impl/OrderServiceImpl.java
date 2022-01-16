package pc.small.service.impl;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.RandomUtil;
import mall.model.Order;
import mall.model.Shop;
import mall.model.Tuser;
import mall.model.admin.Auser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pc.small.dto.OrderDto;
import pc.small.mapper.AuserDao;
import pc.small.mapper.OrderDao;
import pc.small.mapper.ShopDao;
import pc.small.mapper.TuserDao;
import pc.small.service.OrderService;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Service
@Transactional
public class OrderServiceImpl implements OrderService {
    @Autowired
    private ShopDao shopDao;

    @Autowired
    private AuserDao auserDao;
    @Autowired
    private TuserDao tuserDao;
    @Autowired
    private OrderDao orderDao;
    @Override
    public OrderDto buy(String id, String id1) {
        OrderDto orderDto = new OrderDto();

        Shop byId = shopDao.findById(id);
        Auser amoney = auserDao.getAmoney(byId.getAuserid());
        Tuser tuser = tuserDao.reLogin(id1);
        String s1 = String.valueOf(Double.valueOf(amoney.getAmoney()) + Double.valueOf(byId.getShopxprice()));
        String s2 = String.valueOf(Double.valueOf(tuser.getUsermoney()) - Double.valueOf(byId.getShopxprice()));
       Integer i2 = auserDao.updatemoney(s1,byId.getAuserid());
       Integer i1= tuserDao.updatemoney(s2,id1);
        orderDto.setTuser(tuser);
        UUID uuid = UUID.randomUUID();
        String oid = uuid.toString();
        Order order = new Order();
        order.setId(oid);
        String s = "T" + RandomUtil.randomInt(100000000, 1000000000);
        order.setOrderid(s);
        order.setShopid(id);
        order.setAuserid("1");
        order.setOrdermoney(byId.getShopxprice());
        order.setTuserid(id1);
        DateUtil.now();
        String now = DateUtil.now();
        order.setCreate(now);
        order.setDownorder(DateUtil.now());
        if (i1 > 0 && i2>0){

            orderDao.addOrder(order);
            orderDto.setMsg("购买成功");
            orderDto.setOrderid(s);
            orderDto.setCreate(now);
            orderDto.setAphone(amoney.getAphone());
            return orderDto;
        }
        orderDto.setMsg("支付失败");
        return orderDto;
    }

    @Override
    public List<OrderDto> findByUserId(String id) {
       List<Order> orders =  orderDao.findByUserId(id);
       List<OrderDto> list = new ArrayList<>();
        for (Order order : orders) {
            OrderDto orderDto = new OrderDto();
            orderDto.setOrderid(order.getOrderid());
            orderDto.setCreate(order.getCreate());
            orderDto.setOrdermoney(order.getOrdermoney());
            Shop byId = shopDao.findById(order.getShopid());
            orderDto.setShop(byId);
            list.add(orderDto);
        }
        return list;
    }
}
