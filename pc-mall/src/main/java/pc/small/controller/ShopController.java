package pc.small.controller;

import cn.hutool.core.util.StrUtil;
import mall.model.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pc.small.service.ShopService;

import java.util.List;

@Controller
public class ShopController {
    @Autowired
    private ShopService shopService;

    @GetMapping("/shoptype")
    public String typeList(String type, Model model){
        if (StrUtil.isEmpty(type)){
            return "redirect:/";
        }
       List<Shop> types =shopService.findBySelectType(type);
        if (types == null){
            return "redirect:/";
        }
        model.addAttribute("result",types);
        return "proList";
    }
}
