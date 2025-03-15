package com.sample.solo.side.item.service;

import com.sample.solo.side.item.dto.ItemDTO;

import java.util.List;

public interface ItemService {

    // 전체 상품 목록 조회
    List<ItemDTO> findAll();

    // 특정 상품 목록 조회
    List<ItemDTO> findAll(List<Integer> ids);

}
