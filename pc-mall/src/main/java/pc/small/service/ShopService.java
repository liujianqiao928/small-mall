package pc.small.service;

import mall.model.Shop;
import pc.small.dto.ResultDto;

import java.util.List;

public interface ShopService {
    List<Shop> findByType(String type);

    List<Shop> findBySelectType(String jiu);

    List<Shop> selectType(String type);

    Shop findById(String id);

    List<String> findlikeType(String serchtext);

    List<Shop> findByLike(String serchtext);

    ResultDto checkkucun(String id);
}
