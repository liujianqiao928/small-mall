package server.mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminIndexController {
    @GetMapping("/")
    public String tologin(){
        return "login";
    }

    @GetMapping("/tores")
    public String tores(){
        return "register";
    }
    @GetMapping("tolist")
    public String tolist(){
        return "list";
    }
    @GetMapping("/toadd")
    public String toadd(){
        return "add";
    }
}
