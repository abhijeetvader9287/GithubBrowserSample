package com.android.example.github.db;

import java.lang.System;

/**
 * * Main database description.
 */
@android.arch.persistence.room.Database(entities = {com.android.example.github.vo.User.class, com.android.example.github.vo.Repo.class, com.android.example.github.vo.Contributor.class, com.android.example.github.vo.RepoSearchResult.class}, version = 3, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/android/example/github/db/GithubDb;", "Landroid/arch/persistence/room/RoomDatabase;", "()V", "repoDao", "Lcom/android/example/github/db/RepoDao;", "userDao", "Lcom/android/example/github/db/UserDao;", "app_debug"})
public abstract class GithubDb extends android.arch.persistence.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.android.example.github.db.UserDao userDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.android.example.github.db.RepoDao repoDao();
    
    public GithubDb() {
        super();
    }
}