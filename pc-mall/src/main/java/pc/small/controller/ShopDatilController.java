package pc.small.controller;

import mall.model.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pc.small.service.ShopService;

@Controller
public class ShopDatilController {
    @Autowired
    private ShopService shopService;
    @GetMapping("/findshop")
    public String findId(@RequestParam("id") String id, Model m){
     Shop shop = shopService.findById(id);
     m.addAttribute("datil",shop);
     return "proDetail";
    }
}
