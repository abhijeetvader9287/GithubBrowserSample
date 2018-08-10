package com.android.example.github.api;

import java.lang.System;

/**
 * * Simple object to hold repo search responses. This is different from the Entity in the database
 * * because we are keeping a search result in 1 row and denormalizing list of results into a single
 * * column.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001b"}, d2 = {"Lcom/android/example/github/api/RepoSearchResponse;", "", "total", "", "items", "", "Lcom/android/example/github/vo/Repo;", "(ILjava/util/List;)V", "getItems", "()Ljava/util/List;", "nextPage", "getNextPage", "()Ljava/lang/Integer;", "setNextPage", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTotal", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class RepoSearchResponse {
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer nextPage;
    @com.google.gson.annotations.SerializedName(value = "total_count")
    private final int total = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "items")
    private final java.util.List<com.android.example.github.vo.Repo> items = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getNextPage() {
        return null;
    }
    
    public final void setNextPage(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public final int getTotal() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.android.example.github.vo.Repo> getItems() {
        return null;
    }
    
    public RepoSearchResponse(int total, @org.jetbrains.annotations.NotNull()
    java.util.List<com.android.example.github.vo.Repo> items) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.android.example.github.vo.Repo> component2() {
        return null;
    }
    
    /**
     * * Simple object to hold repo search responses. This is different from the Entity in the database
     * * because we are keeping a search result in 1 row and denormalizing list of results into a single
     * * column.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.android.example.github.api.RepoSearchResponse copy(int total, @org.jetbrains.annotations.NotNull()
    java.util.List<com.android.example.github.vo.Repo> items) {
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