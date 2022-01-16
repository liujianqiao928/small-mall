package pc.small.mapper;

import mall.model.admin.Auser;
import org.apache.ibatis.annotations.Param;

public interface AuserDao {
    Auser getAmoney(String id);

    Integer updatemoney(@Param("money") String s1,@Param("id") String auserid);
}
