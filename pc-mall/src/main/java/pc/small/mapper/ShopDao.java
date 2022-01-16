package pc.small.mapper;

import mall.model.Shop;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopDao {
    List<Shop> findByType(@Param("type") String type);

    List<Shop> findBySelectType(@Param("type") String type,@Param("one") String one,@Param("two") String two,@Param("three") String three);

    Shop findById(String id);

    List<String> findLikeTitle(@Param("search") String serchtext);

    List<String> findLikeAll(String serchtext);

    Integer checkshopcount(String id);

    String checkMoney(String id);

    Integer divshopcount(String id);
//    , @Param("tid") List<String> tid,@Param("oid") List<String> oid,@Param("twid") List<String> twid, @Param("thid")List<String> thid
}
