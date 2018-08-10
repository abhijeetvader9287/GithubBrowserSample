package com.android.example.github.di;

import java.lang.System;

@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\'J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\'\u00a8\u0006\u0011"}, d2 = {"Lcom/android/example/github/di/ViewModelModule;", "", "()V", "bindRepoViewModel", "Landroid/arch/lifecycle/ViewModel;", "repoViewModel", "Lcom/android/example/github/ui/repo/RepoViewModel;", "bindSearchViewModel", "searchViewModel", "Lcom/android/example/github/ui/search/SearchViewModel;", "bindUserViewModel", "userViewModel", "Lcom/android/example/github/ui/user/UserViewModel;", "bindViewModelFactory", "Landroid/arch/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/android/example/github/viewmodel/GithubViewModelFactory;", "app_debug"})
@dagger.Module()
public abstract class ViewModelModule {
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.android.example.github.ui.user.UserViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel bindUserViewModel(@org.jetbrains.annotations.NotNull()
    com.android.example.github.ui.user.UserViewModel userViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.android.example.github.ui.search.SearchViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel bindSearchViewModel(@org.jetbrains.annotations.NotNull()
    com.android.example.github.ui.search.SearchViewModel searchViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.android.example.github.ui.repo.RepoViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel bindRepoViewModel(@org.jetbrains.annotations.NotNull()
    com.android.example.github.ui.repo.RepoViewModel repoViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModelProvider.Factory bindViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.android.example.github.viewmodel.GithubViewModelFactory factory);
    
    public ViewModelModule() {
        super();
    }
}