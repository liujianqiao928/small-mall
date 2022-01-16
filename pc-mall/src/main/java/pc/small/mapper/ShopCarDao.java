package pc.small.mapper;

import org.apache.ibatis.annotations.Param;

public interface ShopCarDao {
    String findByIds(@Param("carid") String carid);

    Integer UpdataCar(@Param("ids") String ids, @Param("tid") String tid);


    Integer UpdataCount(@Param("s") String s);
}
