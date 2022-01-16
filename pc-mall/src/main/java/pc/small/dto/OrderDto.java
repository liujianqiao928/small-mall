package pc.small.dto;

import lombok.Data;
import mall.model.Order;
import mall.model.Shop;
import mall.model.ShopType;
import mall.model.Tuser;
@Data
public class OrderDto {
    private String id;
    private String orderid;
    private String ordermoney;
    private String create;
    private String downorder;
    private String shopid;
    private String auserid;
    private String tuserid;
    private Shop shop;
    private Tuser tuser;
    private ShopType shopType;
    private String msg;
    private String aphone;


}
