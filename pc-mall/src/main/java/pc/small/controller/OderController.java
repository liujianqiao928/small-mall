package pc.small.controller;

import mall.model.Tuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pc.small.dto.OrderDto;
import pc.small.service.OrderService;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class OderController {
    @Autowired
    private OrderService orderService;
    @GetMapping("/buy")
    public String buy(@RequestParam("id")String id, Model model, HttpSession session){
      Tuser tuser =  (Tuser) session.getAttribute("user");
     OrderDto orderDto =  orderService.buy(id,tuser.getId());
     model.addAttribute("order",orderDto);
     return "success";
    }
    @GetMapping("/findorder")
    public String findOder(HttpSession session,Model model){
        Tuser tuser =  (Tuser) session.getAttribute("user");
        if (tuser == null){
            return "login";
        }
       List<OrderDto> orderDtos =  orderService.findByUserId(tuser.getId());
       model.addAttribute("orders",orderDtos);
       return "order";
    }
}
