package pc.small.service;

import pc.small.dto.ResultDto;
import pc.small.dto.ShopDto;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface ShopCarService {
    List<ShopDto> findCar(String shopcarid);

    ResultDto addCar(HttpSession session, String s, String id);

    ResultDto del(HttpSession session, String id, String shopcarid);
}
