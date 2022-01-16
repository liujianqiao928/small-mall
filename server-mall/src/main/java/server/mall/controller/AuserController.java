package server.mall.controller.admin;

import cn.hutool.core.util.StrUtil;

import mall.model.admin.Auser;
import mall.tip.FinalTip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import server.mall.service.AuserService;

import javax.servlet.http.HttpSession;

@Controller
public class AuserController {
    @Autowired
    private AuserService tuserService;
    @PostMapping("/login")
    public String login(@RequestParam("email")String email, @RequestParam("password")String
                         password, Model model , HttpSession session){
        if (StrUtil.isAllBlank(email) || StrUtil.isAllBlank(password)){
            model.addAttribute("tusertip", FinalTip.CODENULL);
            return "login";
        }
        Auser userCode = tuserService.findUserCode(email);
        if (userCode == null){
            model.addAttribute("tusertip",FinalTip.CODEEXIST);
            return "login";
        }
        Auser userIsUser = tuserService.findUserIsUser(email);
        if (userIsUser == null){
            model.addAttribute("tusertip",FinalTip.USERLOCK);
            return "login";
        }
        Auser user = tuserService.findUser(email, password);
        if (user !=null){
            session.setAttribute("admin",user);
            return "index";
        }
        model.addAttribute("tusertip",FinalTip.PASSWORDERROR);
        return "login";


    }


    @PostMapping("/exitlogin")
    public String exitLogin(HttpSession session){
       session.removeAttribute("admin");
       session.invalidate();
       return "redirect:/tologin";

    }
}
