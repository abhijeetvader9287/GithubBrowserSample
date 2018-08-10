package com.android.example.github.db;

import java.lang.System;

/**
 * * Interface for database access on Repo related operations.
 */
@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\'J!\u0010\u000b\u001a\u00020\f2\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u000f\"\u00020\u0006H\'\u00a2\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\'J\u0016\u0010\u0015\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013H\'J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00182\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nH\'J\"\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00130\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0013H%J$\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00182\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nH\'J\"\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00130\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0013H\u0016J\u001c\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00130\u00182\u0006\u0010\u001f\u001a\u00020\nH\'J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0006\u0010\t\u001a\u00020\nH\'\u00a8\u0006#"}, d2 = {"Lcom/android/example/github/db/RepoDao;", "", "()V", "createRepoIfNotExists", "", "repo", "Lcom/android/example/github/vo/Repo;", "findSearchResult", "Lcom/android/example/github/vo/RepoSearchResult;", "query", "", "insert", "", "result", "repos", "", "([Lcom/android/example/github/vo/Repo;)V", "insertContributors", "contributors", "", "Lcom/android/example/github/vo/Contributor;", "insertRepos", "repositories", "load", "Landroid/arch/lifecycle/LiveData;", "ownerLogin", "name", "loadById", "repoIds", "", "loadContributors", "owner", "loadOrdered", "loadRepositories", "search", "app_debug"})
@com.android.example.github.testing.OpenForTesting()
public abstract class RepoDao {
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.android.example.github.vo.Repo... repos);
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insertContributors(@org.jetbrains.annotations.NotNull()
    java.util.List<com.android.example.github.vo.Contributor> contributors);
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insertRepos(@org.jetbrains.annotations.NotNull()
    java.util.List<com.android.example.github.vo.Repo> repositories);
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.IGNORE)
    public abstract long createRepoIfNotExists(@org.jetbrains.annotations.NotNull()
    com.android.example.github.vo.Repo repo);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM repo WHERE owner_login = :ownerLogin AND name = :name")
    public abstract android.arch.lifecycle.LiveData<com.android.example.github.vo.Repo> load(@org.jetbrains.annotations.NotNull()
    java.lang.String ownerLogin, @org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "\n        SELECT login, avatarUrl, repoName, repoOwner, contributions FROM contributor\n        WHERE repoName = :name AND repoOwner = :owner\n        ORDER BY contributions DESC")
    public abstract android.arch.lifecycle.LiveData<java.util.List<com.android.example.github.vo.Contributor>> loadContributors(@org.jetbrains.annotations.NotNull()
    java.lang.String owner, @org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "\n        SELECT * FROM Repo\n        WHERE owner_login = :owner\n        ORDER BY stars DESC")
    public abstract android.arch.lifecycle.LiveData<java.util.List<com.android.example.github.vo.Repo>> loadRepositories(@org.jetbrains.annotations.NotNull()
    java.lang.String owner);
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.android.example.github.vo.RepoSearchResult result);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM RepoSearchResult WHERE `query` = :query")
    public abstract android.arch.lifecycle.LiveData<com.android.example.github.vo.RepoSearchResult> search(@org.jetbrains.annotations.NotNull()
    java.lang.String query);
    
    @org.jetbrains.annotations.NotNull()
    public android.arch.lifecycle.LiveData<java.util.List<com.android.example.github.vo.Repo>> loadOrdered(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> repoIds) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM Repo WHERE id in (:repoIds)")
    protected abstract android.arch.lifecycle.LiveData<java.util.List<com.android.example.github.vo.Repo>> loadById(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> repoIds);
    
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.Query(value = "SELECT * FROM RepoSearchResult WHERE `query` = :query")
    public abstract com.android.example.github.vo.RepoSearchResult findSearchResult(@org.jetbrains.annotations.NotNull()
    java.lang.String query);
    
    public RepoDao() {
        super();
    }
}