package server.mall.service;

import server.mall.dto.AddDto;
import server.mall.dto.ResultDto;
import server.mall.dto.ShopDto;

import java.util.List;

public interface ShopService {
    List<ShopDto> findAll();

    ResultDto add(AddDto addDto, String id);
}
