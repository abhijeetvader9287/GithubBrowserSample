package com.android.example.github.repository;

import java.lang.System;

/**
 * * Repository that handles User objects.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/android/example/github/repository/UserRepository;", "", "appExecutors", "Lcom/android/example/github/AppExecutors;", "userDao", "Lcom/android/example/github/db/UserDao;", "githubService", "Lcom/android/example/github/api/GithubService;", "(Lcom/android/example/github/AppExecutors;Lcom/android/example/github/db/UserDao;Lcom/android/example/github/api/GithubService;)V", "loadUser", "Landroid/arch/lifecycle/LiveData;", "Lcom/android/example/github/vo/Resource;", "Lcom/android/example/github/vo/User;", "login", "", "app_debug"})
@javax.inject.Singleton()
@com.android.example.github.testing.OpenForTesting()
public class UserRepository {
    private final com.android.example.github.AppExecutors appExecutors = null;
    private final com.android.example.github.db.UserDao userDao = null;
    private final com.android.example.github.api.GithubService githubService = null;
    
    @org.jetbrains.annotations.NotNull()
    public android.arch.lifecycle.LiveData<com.android.example.github.vo.Resource<com.android.example.github.vo.User>> loadUser(@org.jetbrains.annotations.NotNull()
    java.lang.String login) {
        return null;
    }
    
    @javax.inject.Inject()
    public UserRepository(@org.jetbrains.annotations.NotNull()
    com.android.example.github.AppExecutors appExecutors, @org.jetbrains.annotations.NotNull()
    com.android.example.github.db.UserDao userDao, @org.jetbrains.annotations.NotNull()
    com.android.example.github.api.GithubService githubService) {
        super();
    }
}