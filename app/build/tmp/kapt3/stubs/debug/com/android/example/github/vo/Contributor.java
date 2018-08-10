package com.android.example.github.vo;

import java.lang.System;

@android.arch.persistence.room.Entity(primaryKeys = {"repoName", "repoOwner", "login"}, foreignKeys = {@android.arch.persistence.room.ForeignKey(entity = com.android.example.github.vo.Repo.class, childColumns = {"repoName", "repoOwner"}, deferred = true, onUpdate = 5, parentColumns = {"name", "owner_login"})})
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J)\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0003X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0003X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u0010\u00a8\u0006\u001d"}, d2 = {"Lcom/android/example/github/vo/Contributor;", "", "login", "", "contributions", "", "avatarUrl", "(Ljava/lang/String;ILjava/lang/String;)V", "getAvatarUrl", "()Ljava/lang/String;", "getContributions", "()I", "getLogin", "repoName", "getRepoName", "setRepoName", "(Ljava/lang/String;)V", "repoOwner", "getRepoOwner", "setRepoOwner", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Contributor {
    @org.jetbrains.annotations.NotNull()
    public java.lang.String repoName;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String repoOwner;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "login")
    private final java.lang.String login = null;
    @com.google.gson.annotations.SerializedName(value = "contributions")
    private final int contributions = 0;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "avatar_url")
    private final java.lang.String avatarUrl = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRepoName() {
        return null;
    }
    
    public final void setRepoName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRepoOwner() {
        return null;
    }
    
    public final void setRepoOwner(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLogin() {
        return null;
    }
    
    public final int getContributions() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAvatarUrl() {
        return null;
    }
    
    public Contributor(@org.jetbrains.annotations.NotNull()
    java.lang.String login, int contributions, @org.jetbrains.annotations.Nullable()
    java.lang.String avatarUrl) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.example.github.vo.Contributor copy(@org.jetbrains.annotations.NotNull()
    java.lang.String login, int contributions, @org.jetbrains.annotations.Nullable()
    java.lang.String avatarUrl) {
        return null;
    }
    
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(java.lang.Object p0) {
        return false;
    }
}