package com.ohgiraffers.elasticsearchtest.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ApiResponse<T> {
    private T data;
    private boolean success;
    private String message;

    public static <T> ApiResponse<T> onSuccess(T data) {
        return new ApiResponse<>(data, true, "Success");
    }

    public static <T> ApiResponse<T> onFailure(String message) {
        return new ApiResponse<>(null, false, message);
    }
}
