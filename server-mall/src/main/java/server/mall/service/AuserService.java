package server.mall.service;

import mall.model.admin.Auser;
import org.apache.ibatis.annotations.Param;

public interface AuserService {
    Auser findUserCode(@Param("email") String aemail);
    Auser findUserIsUser(@Param("email") String aemail);
    Auser findUser(@Param("email") String aemail, @Param("password")String apassword);
}
