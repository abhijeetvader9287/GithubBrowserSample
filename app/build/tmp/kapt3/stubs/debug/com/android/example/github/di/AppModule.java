package com.android.example.github.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/android/example/github/di/AppModule;", "", "()V", "provideDb", "Lcom/android/example/github/db/GithubDb;", "app", "Landroid/app/Application;", "provideGithubService", "Lcom/android/example/github/api/GithubService;", "provideRepoDao", "Lcom/android/example/github/db/RepoDao;", "db", "provideUserDao", "Lcom/android/example/github/db/UserDao;", "app_debug"})
@dagger.Module(includes = {com.android.example.github.di.ViewModelModule.class})
public final class AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.android.example.github.api.GithubService provideGithubService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.android.example.github.db.GithubDb provideDb(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.android.example.github.db.UserDao provideUserDao(@org.jetbrains.annotations.NotNull()
    com.android.example.github.db.GithubDb db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.android.example.github.db.RepoDao provideRepoDao(@org.jetbrains.annotations.NotNull()
    com.android.example.github.db.GithubDb db) {
        return null;
    }
    
    public AppModule() {
        super();
    }
}