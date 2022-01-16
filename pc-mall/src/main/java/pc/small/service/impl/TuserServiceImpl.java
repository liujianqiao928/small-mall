package pc.small.service.impl;

import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;

import mall.model.Tuser;
import mall.tip.FinalTip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import pc.small.mapper.TuserDao;
import pc.small.service.TuserService;

import java.util.List;
import java.util.UUID;

@Service
public class TuserServiceImpl implements TuserService {
    @Autowired
    private TuserDao tuserDao;

    @Override
    public Tuser findTUserCode(String aemail) {
        return tuserDao.findTUserCode(aemail);
    }

    @Override
    public Tuser findTUserIsUser(String aemail) {
        return tuserDao.findTUserIsUser(aemail);
    }

    @Override
    public Tuser findTUser(String aemail, String apassword) {
        apassword = SecureUtil.md5(apassword);
        return tuserDao.findTUser(aemail,apassword);
    }

    @Override
    public Boolean addUser(String email, String name, String password, Model model) {
        if (StrUtil.isBlank(email) || StrUtil.isBlank(name) || StrUtil.isBlank(password)){
            model.addAttribute("restusertip", FinalTip.CODENULL);
            return false;
        }
        Tuser tUserCode = tuserDao.findTUserCode(email);
        if (tUserCode!=null){
            model.addAttribute("restusertip", FinalTip.CODEISEXIST);
            return false;
        }
        Tuser y =tuserDao.findTUserByName(name);
        if (y != null){
            model.addAttribute("restusertip", FinalTip.NAMEISEXIST);
            return false;
        }
        Tuser tuser = new Tuser();
        UUID uuid = UUID.randomUUID();
        String string = uuid.toString();
        tuser.setId(string);
        tuser.setIsvip(0);
        tuser.setUsercity("吉林");
        tuser.setUsermoney("0");
        tuser.setUserstatus("1");
        tuser.setUseremail(email);
        tuser.setUserpassword(SecureUtil.md5(password));
        tuser.setUsername(name);
        tuser.setUserlogo("暂时没有");
       Integer res= tuserDao.addUser(tuser);
       if (res>0){
           return true;
       }
       model.addAttribute("restusertip",FinalTip.SERVERERROR);
        return false;
    }
}
