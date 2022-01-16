package pc.small.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopTypeDao {
    String findBuTypeName(@Param("name") String name);

    List<String> findLikeName(String serchtext);

    String findById(@Param("types") String shoptype);
}
