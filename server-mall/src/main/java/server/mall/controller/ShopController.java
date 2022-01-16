package server.mall.controller;

import com.alibaba.fastjson.JSON;
import mall.model.admin.Auser;
import mall.tip.FinalTip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import server.mall.dto.AddDto;
import server.mall.dto.ResultDto;
import server.mall.dto.ShopDto;
import server.mall.service.ShopService;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ShopController {
    @Autowired
    private ShopService shopService;
    @GetMapping("/list")
    public String list(Model model){
        List<ShopDto> all = shopService.findAll();
        model.addAttribute("shop",all);
        return "list";
    }
    @PostMapping("/add")
    @ResponseBody
    public String add(AddDto addDto, HttpSession session){
        ResultDto resultDto = new ResultDto();
        Auser auser = (Auser) session.getAttribute("admin");
        if (auser == null){
            resultDto.setCode(400);
            resultDto.setMsg(FinalTip.NOLOGIN);
            String string = JSON.toJSONString(resultDto);
            return string;
        }
      resultDto =  shopService.add(addDto,auser.getId());
        String string = JSON.toJSONString(resultDto);
        return string;
    }
}
