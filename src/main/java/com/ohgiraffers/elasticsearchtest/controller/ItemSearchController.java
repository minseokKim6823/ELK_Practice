package com.ohgiraffers.elasticsearchtest.controller;

import com.ohgiraffers.elasticsearchtest.common.ApiResponse;
import com.ohgiraffers.elasticsearchtest.entity.ItemDocument;
import com.ohgiraffers.elasticsearchtest.service.ItemSearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/item/search")
public class ItemSearchController {

    private final ItemSearchService itemSearchService;

    @GetMapping
    public ApiResponse<List<ItemDocument>> search(@RequestParam("keyword") String keyword) {
        return ApiResponse.onSuccess(itemSearchService.getItemByName(keyword));
    }

    @PostMapping
    public ApiResponse<ItemDocument> create(@RequestBody ItemDocument itemDocument) {
        return ApiResponse.onSuccess(itemSearchService.createItem(itemDocument));
    }
}
