package server.mall.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OneDao {
    String findByName(@Param("name")String name);

    List<String> findLikeName(String serchtext);

    String findById(@Param("one") String onefl);
}
