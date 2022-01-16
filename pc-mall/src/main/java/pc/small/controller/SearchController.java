package pc.small.controller;

import com.alibaba.fastjson.JSON;
import mall.model.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pc.small.service.ShopService;

import java.util.List;

@Controller
public class SearchController {

    @Autowired
    private ShopService shopService;
    @PostMapping("/saerch")
    @ResponseBody
    public String search(@RequestParam("serchtext") String serchtext){
        System.out.println(serchtext);
       List<String> res=  shopService.findlikeType(serchtext);
        for (String re : res) {
            System.out.println(re);
        }
        String string = JSON.toJSONString(res);
        System.out.println(string);
        return string;
    }
    @PostMapping("/saerchfrom")
    public String searchbtn(@RequestParam("serchtext") String serchtext, Model model){
        System.out.println(serchtext);
      List<Shop> res= shopService.findByLike(serchtext);
      model.addAttribute("result",res);
        return "proList";
    }
}
