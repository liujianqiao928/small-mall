package pc.small.controller;

import mall.model.LikeShop;
import mall.model.Shop;
import mall.model.ShopPhb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pc.small.mapper.ShopPhbDao;
import pc.small.service.LikeShopService;
import pc.small.service.ShopService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private LikeShopService likeShopService;
    @Autowired
    private ShopService shopService;
    @Autowired
    private ShopPhbDao phbDao;
    private List<List<LikeShop>> lists = new ArrayList<>();
    private List<Shop> crighr = new ArrayList<>();
    @GetMapping("/")
    public String indexMall(Model model){
        List<LikeShop> all = likeShopService.findAll();
        lists.add(all);
        List<Shop> day = shopService.findByType("天天特价");
        List<Shop> rqhh = shopService.findByType("人气好货");
        List<ShopPhb> phb = phbDao.findAll();
       List<Shop> jiuyang =  shopService.findBySelectType("九阳");
        List<Shop> clothes = shopService.findBySelectType("服装");
        List<Shop> wsport = shopService.findBySelectType("运动户外");
        List<Shop> jr = shopService.findBySelectType("金融");
        List<Shop> read = shopService.findBySelectType("阅读");


        model.addAttribute("reads",read);
        model.addAttribute("jrs",jr);
        model.addAttribute("sports",wsport);
        model.addAttribute("cleft",clothes);
        model.addAttribute("jiuyang",jiuyang);
        model.addAttribute("phb",phb);
        model.addAttribute("rqhh1" , rqhh.get(0));
        model.addAttribute("rqhh2" , rqhh.get(1));
        model.addAttribute("rqhh3" , rqhh.get(2));
        model.addAttribute("rqhh4" , rqhh.get(3));
        model.addAttribute("rqhh5" , rqhh.get(4));
        model.addAttribute("rqhh6" , rqhh.get(5));
        model.addAttribute("rqhh7" , rqhh.get(6));
        model.addAttribute("rqhh8" , rqhh.get(7));
        model.addAttribute("dayday",day);
        model.addAttribute("shoplike",lists);

        return "index";
    }

    @GetMapping("/toLogin")
    public String tologin(){
        return "login";
    }

    @GetMapping("/toRegister")
    public String tores(){
        return "register";
    }
    @GetMapping("/tooder")
    public String toouder(){
        return "order";
    }
    @GetMapping("/tobuy")
    public String tobuy(){
        return "buy";
    }
    @GetMapping("/tosuc")
    public String toosuc(){
        return "success";
    }
}
