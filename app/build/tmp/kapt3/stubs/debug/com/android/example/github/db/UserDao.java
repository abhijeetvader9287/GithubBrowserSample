package com.android.example.github.db;

import java.lang.System;

/**
 * * Interface for database access for User related operations.
 */
@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\'\u00a8\u0006\n"}, d2 = {"Lcom/android/example/github/db/UserDao;", "", "findByLogin", "Landroid/arch/lifecycle/LiveData;", "Lcom/android/example/github/vo/User;", "login", "", "insert", "", "user", "app_debug"})
public abstract interface UserDao {
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.android.example.github.vo.User user);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM user WHERE login = :login")
    public abstract android.arch.lifecycle.LiveData<com.android.example.github.vo.User> findByLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String login);
}