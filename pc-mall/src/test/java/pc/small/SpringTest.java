package pc.small;

import mall.model.LikeShop;
import mall.model.Shop;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pc.small.service.LikeShopService;
import pc.small.service.ShopService;

import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringTest {
    @Autowired
    private LikeShopService likeShopService;
    @Autowired
    private ShopService shopService;
    @Test
    public void testLike(){
        List<LikeShop> all = likeShopService.findAll();
        for (LikeShop likeShop : all) {
            System.out.println(likeShop);
        }
    }
    @Test
    public void testShopType(){
        List<Shop> day = shopService.findByType("天天特价");
        for (Shop shop : day) {
            System.out.println(shop);
        }

    }
    @Test
    public void testJiuy(){
        List<Shop> day = shopService.findBySelectType("九阳");
        for (Shop shop : day) {
            System.out.println(shop);
        }

    }
}
