package com.android.example.github.di;

import java.lang.System;

@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/android/example/github/di/FragmentBuildersModule;", "", "()V", "contributeRepoFragment", "Lcom/android/example/github/ui/repo/RepoFragment;", "contributeSearchFragment", "Lcom/android/example/github/ui/search/SearchFragment;", "contributeUserFragment", "Lcom/android/example/github/ui/user/UserFragment;", "app_debug"})
@dagger.Module()
public abstract class FragmentBuildersModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.android.example.github.ui.repo.RepoFragment contributeRepoFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.android.example.github.ui.user.UserFragment contributeUserFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.android.example.github.ui.search.SearchFragment contributeSearchFragment();
    
    public FragmentBuildersModule() {
        super();
    }
}