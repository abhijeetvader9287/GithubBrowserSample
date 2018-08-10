package com.android.example.github.ui.common;

import java.lang.System;

/**
 * * A RecyclerView adapter for [Repo] class.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\rJ\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0002H\u0014J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0014R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000eR\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/android/example/github/ui/common/RepoListAdapter;", "Lcom/android/example/github/ui/common/DataBoundListAdapter;", "Lcom/android/example/github/vo/Repo;", "Lcom/android/example/github/databinding/RepoItemBinding;", "dataBindingComponent", "error/NonExistentClass", "appExecutors", "Lcom/android/example/github/AppExecutors;", "showFullName", "", "repoClickCallback", "Lkotlin/Function1;", "", "(Lerror/NonExistentClass;Lcom/android/example/github/AppExecutors;ZLkotlin/jvm/functions/Function1;)V", "Lerror/NonExistentClass;", "bind", "binding", "item", "createBinding", "parent", "Landroid/view/ViewGroup;", "app_debug"})
public final class RepoListAdapter extends com.android.example.github.ui.common.DataBoundListAdapter<com.android.example.github.vo.Repo, com.android.example.github.databinding.RepoItemBinding> {
    private final error.NonExistentClass dataBindingComponent = null;
    private final boolean showFullName = false;
    private final kotlin.jvm.functions.Function1<com.android.example.github.vo.Repo, kotlin.Unit> repoClickCallback = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.android.example.github.databinding.RepoItemBinding createBinding(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    protected void bind(@org.jetbrains.annotations.NotNull()
    com.android.example.github.databinding.RepoItemBinding binding, @org.jetbrains.annotations.NotNull()
    com.android.example.github.vo.Repo item) {
    }
    
    public RepoListAdapter(@org.jetbrains.annotations.NotNull()
    error.NonExistentClass dataBindingComponent, @org.jetbrains.annotations.NotNull()
    com.android.example.github.AppExecutors appExecutors, boolean showFullName, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.android.example.github.vo.Repo, kotlin.Unit> repoClickCallback) {
        super(null, null);
    }
}