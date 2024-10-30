package com.ohgiraffers.elasticsearchtest.repository;

import com.ohgiraffers.elasticsearchtest.entity.ItemDocument;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ItemElasticRepository extends ElasticsearchRepository<ItemDocument,Long> {
    List<ItemDocument> findByName(String keyword);
}
