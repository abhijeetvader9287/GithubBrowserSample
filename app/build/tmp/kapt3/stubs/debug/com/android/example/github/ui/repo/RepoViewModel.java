package com.android.example.github.ui.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001:\u0001\u001aB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0092\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\n0\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lcom/android/example/github/ui/repo/RepoViewModel;", "Landroid/arch/lifecycle/ViewModel;", "repository", "Lcom/android/example/github/repository/RepoRepository;", "(Lcom/android/example/github/repository/RepoRepository;)V", "_repoId", "Landroid/arch/lifecycle/MutableLiveData;", "Lcom/android/example/github/ui/repo/RepoViewModel$RepoId;", "contributors", "Landroid/arch/lifecycle/LiveData;", "Lcom/android/example/github/vo/Resource;", "", "Lcom/android/example/github/vo/Contributor;", "getContributors", "()Landroid/arch/lifecycle/LiveData;", "repo", "Lcom/android/example/github/vo/Repo;", "getRepo", "repoId", "getRepoId", "retry", "", "setId", "owner", "", "name", "RepoId", "app_debug"})
@com.android.example.github.testing.OpenForTesting()
public class RepoViewModel extends android.arch.lifecycle.ViewModel {
    private final android.arch.lifecycle.MutableLiveData<com.android.example.github.ui.repo.RepoViewModel.RepoId> _repoId = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.LiveData<com.android.example.github.vo.Resource<com.android.example.github.vo.Repo>> repo = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.LiveData<com.android.example.github.vo.Resource<java.util.List<com.android.example.github.vo.Contributor>>> contributors = null;
    
    @org.jetbrains.annotations.NotNull()
    public android.arch.lifecycle.LiveData<com.android.example.github.ui.repo.RepoViewModel.RepoId> getRepoId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public android.arch.lifecycle.LiveData<com.android.example.github.vo.Resource<com.android.example.github.vo.Repo>> getRepo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public android.arch.lifecycle.LiveData<com.android.example.github.vo.Resource<java.util.List<com.android.example.github.vo.Contributor>>> getContributors() {
        return null;
    }
    
    public void retry() {
    }
    
    public void setId(@org.jetbrains.annotations.NotNull()
    java.lang.String owner, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    @javax.inject.Inject()
    public RepoViewModel(@org.jetbrains.annotations.NotNull()
    com.android.example.github.repository.RepoRepository repository) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J2\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0012\"\u0004\b\u0000\u0010\u00132\u001e\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00130\u00120\u0015J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0017"}, d2 = {"Lcom/android/example/github/ui/repo/RepoViewModel$RepoId;", "", "owner", "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getOwner", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "ifExists", "Landroid/arch/lifecycle/LiveData;", "T", "f", "Lkotlin/Function2;", "toString", "app_debug"})
    public static final class RepoId {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String owner = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>android.arch.lifecycle.LiveData<T> ifExists(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, ? extends android.arch.lifecycle.LiveData<T>> f) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getOwner() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        public RepoId(@org.jetbrains.annotations.NotNull()
        java.lang.String owner, @org.jetbrains.annotations.NotNull()
        java.lang.String name) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.android.example.github.ui.repo.RepoViewModel.RepoId copy(@org.jetbrains.annotations.NotNull()
        java.lang.String owner, @org.jetbrains.annotations.NotNull()
        java.lang.String name) {
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
}