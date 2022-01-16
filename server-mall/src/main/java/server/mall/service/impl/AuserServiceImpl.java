package server.mall.service.impl;

import mall.model.admin.Auser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.mall.mapper.AuserDao;
import server.mall.service.AuserService;

@Service
public class AuserServiceImpl implements AuserService {
    @Autowired
    private AuserDao auserDao;
    @Override
    public Auser findUserCode(String aemail) {
        return auserDao.findUserCode(aemail);
    }

    @Override
    public Auser findUserIsUser(String aemail) {
        return auserDao.findUserIsUser(aemail);
    }

    @Override
    public Auser findUser(String aemail, String apassword) {
        return auserDao.findUser(aemail,apassword);
    }
}
