package pc.small.service;

import mall.model.Tuser;
import org.apache.ibatis.annotations.Param;
import org.springframework.ui.Model;

import java.util.List;

public interface TuserService {
    Tuser findTUserCode(@Param("email") String aemail);
    Tuser findTUserIsUser(@Param("email") String aemail);
    Tuser findTUser(@Param("email") String aemail,@Param("password")String apassword);

    Boolean addUser(String email, String name, String password, Model model);
}
