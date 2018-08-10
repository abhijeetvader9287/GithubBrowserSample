package com.android.example.github.ui.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00172\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR&\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f0\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000f0\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\r\u00a8\u0006\u0019"}, d2 = {"Lcom/android/example/github/ui/user/UserViewModel;", "Landroid/arch/lifecycle/ViewModel;", "userRepository", "Lcom/android/example/github/repository/UserRepository;", "repoRepository", "Lcom/android/example/github/repository/RepoRepository;", "(Lcom/android/example/github/repository/UserRepository;Lcom/android/example/github/repository/RepoRepository;)V", "_login", "Landroid/arch/lifecycle/MutableLiveData;", "", "login", "Landroid/arch/lifecycle/LiveData;", "getLogin", "()Landroid/arch/lifecycle/LiveData;", "repositories", "Lcom/android/example/github/vo/Resource;", "", "Lcom/android/example/github/vo/Repo;", "getRepositories", "user", "Lcom/android/example/github/vo/User;", "getUser", "retry", "", "setLogin", "app_debug"})
@com.android.example.github.testing.OpenForTesting()
public class UserViewModel extends android.arch.lifecycle.ViewModel {
    private final android.arch.lifecycle.MutableLiveData<java.lang.String> _login = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.LiveData<com.android.example.github.vo.Resource<java.util.List<com.android.example.github.vo.Repo>>> repositories = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.LiveData<com.android.example.github.vo.Resource<com.android.example.github.vo.User>> user = null;
    
    @org.jetbrains.annotations.NotNull()
    public android.arch.lifecycle.LiveData<java.lang.String> getLogin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public android.arch.lifecycle.LiveData<com.android.example.github.vo.Resource<java.util.List<com.android.example.github.vo.Repo>>> getRepositories() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public android.arch.lifecycle.LiveData<com.android.example.github.vo.Resource<com.android.example.github.vo.User>> getUser() {
        return null;
    }
    
    public void setLogin(@org.jetbrains.annotations.Nullable()
    java.lang.String login) {
    }
    
    public void retry() {
    }
    
    @javax.inject.Inject()
    public UserViewModel(@org.jetbrains.annotations.NotNull()
    com.android.example.github.repository.UserRepository userRepository, @org.jetbrains.annotations.NotNull()
    com.android.example.github.repository.RepoRepository repoRepository) {
        super();
    }
}