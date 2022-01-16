package pc.small.controller;

import com.alibaba.fastjson.JSON;
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
import pc.small.service.ShopCarService;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ShopCarController {
    @Autowired
    private ShopCarService shopCarService;
    @GetMapping("/shopcar")
    public String getCar(HttpSession session, Model model){
        Tuser user = (Tuser) session.getAttribute("user");
        if (user == null){
            return "login";
        }
        List<ShopDto> res =  shopCarService.findCar(user.getShopcarid());
        Double xtotle=0.0;
        Double ytotle=0.0;
        for (ShopDto re : res) {
            xtotle = xtotle +Double.parseDouble(re.getShopxprice());
            ytotle = ytotle +Double.parseDouble(re.getShopyprice());
        }
        model.addAttribute("xtotle",xtotle);
        model.addAttribute("ytotle",ytotle);
        model.addAttribute("ctotle",ytotle-xtotle);
        model.addAttribute("cars",res);
        return "shopCar";
    }

    @PostMapping("/addcar")
    @ResponseBody
    public String addcar(@RequestParam("id")String id,HttpSession session){
        ResultDto resultDto = new ResultDto();
        Tuser tuser = (Tuser) session.getAttribute("user");
        if (tuser == null){
            resultDto.setMsg(FinalTip.NOLOGIN);
            resultDto.setCode(400);
            String string = JSON.toJSONString(resultDto);
            return string;
        }
        resultDto = shopCarService.addCar(session,id,tuser.getShopcarid());
        String string = JSON.toJSONString(resultDto);
        return string;
    }
    @PostMapping("/delcar")
    @ResponseBody
    public String delcar(@RequestParam("id") String id,HttpSession session){
        ResultDto resultDto = new ResultDto();
        Tuser tuser = (Tuser) session.getAttribute("user");
        if (tuser == null){
            resultDto.setMsg(FinalTip.NOLOGIN);
            resultDto.setCode(400);
            String string = JSON.toJSONString(resultDto);
            return string;
        }
        resultDto = shopCarService.del(session,id,tuser.getShopcarid());
        String string = JSON.toJSONString(resultDto);
        return string;
    }
}
