package pc.small.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TwoDao {
    String findByName(@Param("name")String name);

    List<String> findLikeName(String serchtext);
}
