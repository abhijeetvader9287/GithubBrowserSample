package com.android.example.github.repository;

import java.lang.System;

/**
 * * Repository that handles Repo instances.
 * *
 * * unfortunate naming :/ .
 * * Repo - value object name
 * * Repository - type of this class.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ*\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0016J$\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0016J\"\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00110\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\rH\u0016J\"\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00110\u00100\u000f2\u0006\u0010\u0019\u001a\u00020\rH\u0016J\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00100\u000f2\u0006\u0010\u0019\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/android/example/github/repository/RepoRepository;", "", "appExecutors", "Lcom/android/example/github/AppExecutors;", "db", "Lcom/android/example/github/db/GithubDb;", "repoDao", "Lcom/android/example/github/db/RepoDao;", "githubService", "Lcom/android/example/github/api/GithubService;", "(Lcom/android/example/github/AppExecutors;Lcom/android/example/github/db/GithubDb;Lcom/android/example/github/db/RepoDao;Lcom/android/example/github/api/GithubService;)V", "repoListRateLimit", "Lcom/android/example/github/util/RateLimiter;", "", "loadContributors", "Landroid/arch/lifecycle/LiveData;", "Lcom/android/example/github/vo/Resource;", "", "Lcom/android/example/github/vo/Contributor;", "owner", "name", "loadRepo", "Lcom/android/example/github/vo/Repo;", "loadRepos", "search", "query", "searchNextPage", "", "app_debug"})
@com.android.example.github.testing.OpenForTesting()
@javax.inject.Singleton()
public class RepoRepository {
    private final com.android.example.github.util.RateLimiter<java.lang.String> repoListRateLimit = null;
    private final com.android.example.github.AppExecutors appExecutors = null;
    private final com.android.example.github.db.GithubDb db = null;
    private final com.android.example.github.db.RepoDao repoDao = null;
    private final com.android.example.github.api.GithubService githubService = null;
    
    @org.jetbrains.annotations.NotNull()
    public android.arch.lifecycle.LiveData<com.android.example.github.vo.Resource<java.util.List<com.android.example.github.vo.Repo>>> loadRepos(@org.jetbrains.annotations.NotNull()
    java.lang.String owner) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public android.arch.lifecycle.LiveData<com.android.example.github.vo.Resource<com.android.example.github.vo.Repo>> loadRepo(@org.jetbrains.annotations.NotNull()
    java.lang.String owner, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public android.arch.lifecycle.LiveData<com.android.example.github.vo.Resource<java.util.List<com.android.example.github.vo.Contributor>>> loadContributors(@org.jetbrains.annotations.NotNull()
    java.lang.String owner, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public android.arch.lifecycle.LiveData<com.android.example.github.vo.Resource<java.lang.Boolean>> searchNextPage(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public android.arch.lifecycle.LiveData<com.android.example.github.vo.Resource<java.util.List<com.android.example.github.vo.Repo>>> search(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @javax.inject.Inject()
    public RepoRepository(@org.jetbrains.annotations.NotNull()
    com.android.example.github.AppExecutors appExecutors, @org.jetbrains.annotations.NotNull()
    com.android.example.github.db.GithubDb db, @org.jetbrains.annotations.NotNull()
    com.android.example.github.db.RepoDao repoDao, @org.jetbrains.annotations.NotNull()
    com.android.example.github.api.GithubService githubService) {
        super();
    }
}