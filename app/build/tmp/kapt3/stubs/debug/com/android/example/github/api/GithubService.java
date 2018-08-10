package com.android.example.github.api;

import java.lang.System;

/**
 * * REST API access points
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH\'J(\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH\'J$\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\u00040\u00032\b\b\u0001\u0010\r\u001a\u00020\bH\'J\u001e\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u00032\b\b\u0001\u0010\r\u001a\u00020\bH\'J\u001e\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00040\u00032\b\b\u0001\u0010\u0012\u001a\u00020\bH\'J\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\b\b\u0001\u0010\u0012\u001a\u00020\b2\b\b\u0001\u0010\u0014\u001a\u00020\u0015H\'\u00a8\u0006\u0016"}, d2 = {"Lcom/android/example/github/api/GithubService;", "", "getContributors", "Landroid/arch/lifecycle/LiveData;", "Lcom/android/example/github/api/ApiResponse;", "", "Lcom/android/example/github/vo/Contributor;", "owner", "", "name", "getRepo", "Lcom/android/example/github/vo/Repo;", "getRepos", "login", "getUser", "Lcom/android/example/github/vo/User;", "searchRepos", "Lcom/android/example/github/api/RepoSearchResponse;", "query", "Lretrofit2/Call;", "page", "", "app_debug"})
public abstract interface GithubService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "users/{login}")
    public abstract android.arch.lifecycle.LiveData<com.android.example.github.api.ApiResponse<com.android.example.github.vo.User>> getUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "login")
    java.lang.String login);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "users/{login}/repos")
    public abstract android.arch.lifecycle.LiveData<com.android.example.github.api.ApiResponse<java.util.List<com.android.example.github.vo.Repo>>> getRepos(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "login")
    java.lang.String login);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "repos/{owner}/{name}")
    public abstract android.arch.lifecycle.LiveData<com.android.example.github.api.ApiResponse<com.android.example.github.vo.Repo>> getRepo(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "owner")
    java.lang.String owner, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "name")
    java.lang.String name);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "repos/{owner}/{name}/contributors")
    public abstract android.arch.lifecycle.LiveData<com.android.example.github.api.ApiResponse<java.util.List<com.android.example.github.vo.Contributor>>> getContributors(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "owner")
    java.lang.String owner, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "name")
    java.lang.String name);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "search/repositories")
    public abstract android.arch.lifecycle.LiveData<com.android.example.github.api.ApiResponse<com.android.example.github.api.RepoSearchResponse>> searchRepos(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String query);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "search/repositories")
    public abstract retrofit2.Call<com.android.example.github.api.RepoSearchResponse> searchRepos(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String query, @retrofit2.http.Query(value = "page")
    int page);
}