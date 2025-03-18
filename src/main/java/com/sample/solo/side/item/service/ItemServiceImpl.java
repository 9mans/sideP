package com.sample.solo.side.item.service;

import com.sample.solo.side.item.dto.ItemDTO;
import com.sample.solo.side.item.entity.Item;
import com.sample.solo.side.item.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService{

    private final ItemRepository itemRepository;

    @Override
    public List<ItemDTO> findAll() {
        return itemRepository.findAll()
                                .stream()
                                .map(Item::toDto)
                                .toList();
    }

    @Override
    public List<ItemDTO> findAll(List<Integer> ids) {
        return itemRepository.findAllByIdIn(ids)
                                .stream()
                                .map(Item::toDto)
                                .toList();
    }
}
