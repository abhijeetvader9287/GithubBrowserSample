package com.android.example.github.api;

import java.lang.System;

/**
 * * Common class used by API responses.
 * * @param <T> the type of the response object
 * </T> 
 */
@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u0004*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0003\u0005\u0006\u0007\u00a8\u0006\b"}, d2 = {"Lcom/android/example/github/api/ApiResponse;", "T", "", "()V", "Companion", "Lcom/android/example/github/api/ApiEmptyResponse;", "Lcom/android/example/github/api/ApiSuccessResponse;", "Lcom/android/example/github/api/ApiErrorResponse;", "app_debug"})
public abstract class ApiResponse<T extends java.lang.Object> {
    public static final com.android.example.github.api.ApiResponse.Companion Companion = null;
    
    private ApiResponse() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J \u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\b\"\u0004\b\u0001\u0010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00050\n\u00a8\u0006\u000b"}, d2 = {"Lcom/android/example/github/api/ApiResponse$Companion;", "", "()V", "create", "Lcom/android/example/github/api/ApiErrorResponse;", "T", "error", "", "Lcom/android/example/github/api/ApiResponse;", "response", "Lretrofit2/Response;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.android.example.github.api.ApiErrorResponse<T> create(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable error) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.android.example.github.api.ApiResponse<T> create(@org.jetbrains.annotations.NotNull()
        retrofit2.Response<T> response) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}