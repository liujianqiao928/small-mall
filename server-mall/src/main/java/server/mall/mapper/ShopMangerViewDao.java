package server.mall.mapper;

import mall.model.view.ShopMangerView;

import java.util.List;

public interface ShopMangerViewDao {
    List<ShopMangerView> findAll();
}
