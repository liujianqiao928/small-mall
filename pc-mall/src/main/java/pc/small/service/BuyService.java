package pc.small.service;

import pc.small.dto.ResultDto;
import pc.small.dto.ShopDto;

public interface BuyService {
    ShopDto getBuy(String id, String id1);

    ResultDto checkMoney(String id, String id1);
}
