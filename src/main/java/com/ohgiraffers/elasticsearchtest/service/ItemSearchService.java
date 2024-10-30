package com.ohgiraffers.elasticsearchtest.service;

import com.ohgiraffers.elasticsearchtest.entity.ItemDocument;
//import com.ohgiraffers.elasticsearchtest.repository.ItemJpaRepository;
import com.ohgiraffers.elasticsearchtest.repository.ItemElasticRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemSearchService {

    private final ItemElasticRepository itemElasticRepository;

    public ItemDocument createItem(ItemDocument itemDocument){
        return itemElasticRepository.save(itemDocument);
    }

    public List<ItemDocument> getItemByName(String keyword) {
        List<ItemDocument> byName = itemElasticRepository.findByName(keyword);
        return byName;
    }
}
