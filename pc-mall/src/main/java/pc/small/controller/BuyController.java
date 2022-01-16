package pc.small.controller;

import com.alibaba.fastjson.JSON;
import mall.model.Shop;
import mall.model.Tuser;
import mall.tip.FinalTip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pc.small.dto.ResultDto;
import pc.small.dto.ShopDto;
import pc.small.service.BuyService;
import pc.small.service.ShopService;

import javax.servlet.http.HttpSession;

@Controller
public class BuyController {
    @Autowired
    private ShopService shopService;
    @Autowired
    private BuyService buyService;

    @PostMapping("/checkkucun")
    @ResponseBody
    public String checkkucun(@RequestParam("id") String id, HttpSession session) {
        ResultDto resultDto = new ResultDto();
        Tuser tuser = (Tuser) session.getAttribute("user");
        if (tuser == null) {
            resultDto.setCode(400);

            resultDto.setMsg(FinalTip.NOLOGIN);
            String s = JSON.toJSONString(resultDto);
            return s;
        }

        resultDto = shopService.checkkucun(id);
        String s = JSON.toJSONString(resultDto);
        return s;
    }

    @GetMapping("/getbuy")
    public String getShopMsg(@RequestParam("id") String id, Model model, HttpSession session) {
        Tuser tuser = (Tuser) session.getAttribute("user");
        ShopDto shopDto = buyService.getBuy(id, tuser.getId());
        Double res = Double.valueOf(shopDto.getShopyprice()) - Double.parseDouble(shopDto.getShopxprice());
        model.addAttribute("buyc", res);
        model.addAttribute("gbuy", shopDto);
        return "buy";
    }

    @PostMapping("/checkmoney")
    @ResponseBody
    public String checkmoney(@RequestParam("id") String id, HttpSession session) {
        ResultDto resultDto = new ResultDto();
        Tuser tuser = (Tuser) session.getAttribute("user");
        if (tuser == null) {
            resultDto.setCode(400);

            resultDto.setMsg(FinalTip.NOLOGIN);
            String s = JSON.toJSONString(resultDto);
            return s;
        }
         resultDto = buyService.checkMoney(id, tuser.getId());
        String s = JSON.toJSONString(resultDto);
        return s;
    }
}
