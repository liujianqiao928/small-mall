package pc.small.dto;

import lombok.Data;
import mall.model.ShopType;
import mall.model.Tuser;

import java.time.Period;

@Data
public class ShopDto {
    private String shopid;
    private String shoptitle;
    private String simpledesc;
    private String shopkey;
    private String shopfl;
    private String shoptype;
    private String shopyprice;
    private String shopxprice;
    private Integer shopcount;
    private String shopgg;
    private Integer isupjia;
    private Integer iscomm;
    private String shopimg;
    private String shopdesc;
    private String onefl;
    private String twofl;
    private String threefl;
    private String auserid;
    private Integer sellcount;
    private String create;
    private String commcount;
    private Integer isziying;
    private String pertmers;
    private Tuser tuser;
    private ShopType shopType;
    private String typename;
    private String shopbaozhuang;
}
