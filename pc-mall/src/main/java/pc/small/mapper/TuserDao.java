package pc.small.mapper;

import mall.model.Tuser;
import org.apache.ibatis.annotations.Param;

public interface TuserDao {
    Tuser findTUserCode(@Param("email") String aemail);
    Tuser findTUserIsUser(@Param("email") String aemail);
    Tuser findTUser(@Param("email") String aemail,@Param("password")String apassword);

    Integer addUser(Tuser tuser);

    Tuser findTUserByName(@Param("name") String name);


    Tuser reLogin(@Param("s") String s);

    Integer UpdataShopCount(@Param("r") Integer r,@Param("s") String s);

    String checkMoney(String id1);

    Integer updatemoney(@Param("money") String s1,@Param("id") String id1);
}
