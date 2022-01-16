package pc.small.service;

import pc.small.dto.OrderDto;

import java.util.List;

public interface OrderService {
    OrderDto buy(String id, String id1);

    List<OrderDto> findByUserId(String id);
}
