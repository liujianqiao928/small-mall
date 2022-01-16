package pc.small.mapper;

import mall.model.Order;

import java.util.List;

public interface OrderDao {
    Integer addOrder(Order order);

    List<Order> findByUserId(String id);
}
