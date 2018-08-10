package com.android.example.github.repository;

import java.lang.System;

/**
 * * A task that reads the search result in the database and fetches the next page, if it has one.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/android/example/github/repository/FetchNextSearchPageTask;", "Ljava/lang/Runnable;", "query", "", "githubService", "Lcom/android/example/github/api/GithubService;", "db", "Lcom/android/example/github/db/GithubDb;", "(Ljava/lang/String;Lcom/android/example/github/api/GithubService;Lcom/android/example/github/db/GithubDb;)V", "_liveData", "Landroid/arch/lifecycle/MutableLiveData;", "Lcom/android/example/github/vo/Resource;", "", "liveData", "Landroid/arch/lifecycle/LiveData;", "getLiveData", "()Landroid/arch/lifecycle/LiveData;", "run", "", "app_debug"})
public final class FetchNextSearchPageTask implements java.lang.Runnable {
    private final android.arch.lifecycle.MutableLiveData<com.android.example.github.vo.Resource<java.lang.Boolean>> _liveData = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.LiveData<com.android.example.github.vo.Resource<java.lang.Boolean>> liveData = null;
    private final java.lang.String query = null;
    private final com.android.example.github.api.GithubService githubService = null;
    private final com.android.example.github.db.GithubDb db = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<com.android.example.github.vo.Resource<java.lang.Boolean>> getLiveData() {
        return null;
    }
    
    @java.lang.Override()
    public void run() {
    }
    
    public FetchNextSearchPageTask(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    com.android.example.github.api.GithubService githubService, @org.jetbrains.annotations.NotNull()
    com.android.example.github.db.GithubDb db) {
        super();
    }
}