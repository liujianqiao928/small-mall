package pc.small.controller;

import cn.hutool.core.util.StrUtil;

import mall.model.Tuser;
import mall.tip.FinalTip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pc.small.service.TuserService;

import javax.servlet.http.HttpSession;

@Controller
public class TuserController {
    @Autowired
    private TuserService tuserService;
    @PostMapping("/login")
    public String login(@RequestParam("email")String email, @RequestParam("password")String
            password, Model model , HttpSession session){
        if (StrUtil.isAllBlank(email) || StrUtil.isAllBlank(password)){
            model.addAttribute("ausertip", FinalTip.CODENULL);
            return "login";
        }
        Tuser userCode = tuserService.findTUserCode(email);
        if (userCode == null){
            model.addAttribute("ausertip",FinalTip.CODEEXIST);
            return "login";
        }
        Tuser userIsUser = tuserService.findTUserIsUser(email);
        if (userIsUser == null){
            model.addAttribute("ausertip",FinalTip.USERLOCK);
            return "login";
        }
        Tuser user = tuserService.findTUser(email, password);
        if (user !=null){
            session.setAttribute("user",user);
            return "redirect:/";
        }
        model.addAttribute("ausertip",FinalTip.PASSWORDERROR);
        return "login";


    }
    @PostMapping("/res")
    public String register(@RequestParam("email")String email ,@RequestParam("tname")String name,@RequestParam("password")String password , Model model){
        Boolean result=tuserService.addUser(email,name,password,model);
        if (result){
            return "login";
        }
        return "register";
    }
    @PostMapping("/exitlogin")
    public String exitLogin(HttpSession session){
        session.removeAttribute("user");
        session.invalidate();
        return "redirect:/tologin";

    }
}
