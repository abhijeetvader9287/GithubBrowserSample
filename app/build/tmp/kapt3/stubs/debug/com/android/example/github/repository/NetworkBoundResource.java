package com.android.example.github.repository;

import java.lang.System;

/**
 * * A generic class that can provide a resource backed by both the sqlite database and the network.
 * *
 * *
 * * You can read more about it in the [Architecture
 * * Guide](https://developer.android.com/arch).
 * * @param <ResultType>
 * * @param <RequestType>
 * </RequestType></ResultType> 
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\u000bJ\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r0\u000bH%J\u0016\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH%J\b\u0010\u0012\u001a\u00020\u000fH\u0014J\u001b\u0010\u0013\u001a\u00028\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015H\u0015\u00a2\u0006\u0002\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00028\u0001H%\u00a2\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\u000f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0003J\u0017\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00018\u0000H%\u00a2\u0006\u0002\u0010\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/android/example/github/repository/NetworkBoundResource;", "ResultType", "RequestType", "", "appExecutors", "Lcom/android/example/github/AppExecutors;", "(Lcom/android/example/github/AppExecutors;)V", "result", "Landroid/arch/lifecycle/MediatorLiveData;", "Lcom/android/example/github/vo/Resource;", "asLiveData", "Landroid/arch/lifecycle/LiveData;", "createCall", "Lcom/android/example/github/api/ApiResponse;", "fetchFromNetwork", "", "dbSource", "loadFromDb", "onFetchFailed", "processResponse", "response", "Lcom/android/example/github/api/ApiSuccessResponse;", "(Lcom/android/example/github/api/ApiSuccessResponse;)Ljava/lang/Object;", "saveCallResult", "item", "(Ljava/lang/Object;)V", "setValue", "newValue", "shouldFetch", "", "data", "(Ljava/lang/Object;)Z", "app_debug"})
public abstract class NetworkBoundResource<ResultType extends java.lang.Object, RequestType extends java.lang.Object> {
    private final android.arch.lifecycle.MediatorLiveData<com.android.example.github.vo.Resource<ResultType>> result = null;
    private final com.android.example.github.AppExecutors appExecutors = null;
    
    @android.support.annotation.MainThread()
    private final void setValue(com.android.example.github.vo.Resource<? extends ResultType> newValue) {
    }
    
    private final void fetchFromNetwork(android.arch.lifecycle.LiveData<ResultType> dbSource) {
    }
    
    protected void onFetchFailed() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<com.android.example.github.vo.Resource<ResultType>> asLiveData() {
        return null;
    }
    
    @android.support.annotation.WorkerThread()
    protected RequestType processResponse(@org.jetbrains.annotations.NotNull()
    com.android.example.github.api.ApiSuccessResponse<RequestType> response) {
        return null;
    }
    
    @android.support.annotation.WorkerThread()
    protected abstract void saveCallResult(RequestType item);
    
    @android.support.annotation.MainThread()
    protected abstract boolean shouldFetch(@org.jetbrains.annotations.Nullable()
    ResultType data);
    
    @org.jetbrains.annotations.NotNull()
    @android.support.annotation.MainThread()
    protected abstract android.arch.lifecycle.LiveData<ResultType> loadFromDb();
    
    @org.jetbrains.annotations.NotNull()
    @android.support.annotation.MainThread()
    protected abstract android.arch.lifecycle.LiveData<com.android.example.github.api.ApiResponse<RequestType>> createCall();
    
    @android.support.annotation.MainThread()
    public NetworkBoundResource(@org.jetbrains.annotations.NotNull()
    com.android.example.github.AppExecutors appExecutors) {
        super();
    }
}