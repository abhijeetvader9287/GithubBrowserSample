package com.android.example.github.ui.common;

import java.lang.System;

/**
 * * A generic RecyclerView adapter that uses Data Binding & DiffUtil.
 * *
 * * @param <T> Type of the items in the list
 * * @param <V> The type of the ViewDataBinding
 * </V></T> 
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u00a2\u0006\u0002\u0010\nJ\u001d\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u00012\u0006\u0010\u000e\u001a\u00028\u0000H$\u00a2\u0006\u0002\u0010\u000fJ\u0015\u0010\u0010\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u0012H$\u00a2\u0006\u0002\u0010\u0013J\u001e\u0010\u0014\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0017H\u0016\u00a8\u0006\u001a"}, d2 = {"Lcom/android/example/github/ui/common/DataBoundListAdapter;", "T", "V", "Landroid/databinding/ViewDataBinding;", "Landroid/support/v7/recyclerview/extensions/ListAdapter;", "Lcom/android/example/github/ui/common/DataBoundViewHolder;", "appExecutors", "Lcom/android/example/github/AppExecutors;", "diffCallback", "Landroid/support/v7/util/DiffUtil$ItemCallback;", "(Lcom/android/example/github/AppExecutors;Landroid/support/v7/util/DiffUtil$ItemCallback;)V", "bind", "", "binding", "item", "(Landroid/databinding/ViewDataBinding;Ljava/lang/Object;)V", "createBinding", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)Landroid/databinding/ViewDataBinding;", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "viewType", "app_debug"})
public abstract class DataBoundListAdapter<T extends java.lang.Object, V extends android.databinding.ViewDataBinding> extends android.support.v7.recyclerview.extensions.ListAdapter<T, com.android.example.github.ui.common.DataBoundViewHolder<? extends V>> {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.android.example.github.ui.common.DataBoundViewHolder<V> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract V createBinding(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent);
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.android.example.github.ui.common.DataBoundViewHolder<? extends V> holder, int position) {
    }
    
    protected abstract void bind(@org.jetbrains.annotations.NotNull()
    V binding, T item);
    
    public DataBoundListAdapter(@org.jetbrains.annotations.NotNull()
    com.android.example.github.AppExecutors appExecutors, @org.jetbrains.annotations.NotNull()
    android.support.v7.util.DiffUtil.ItemCallback<T> diffCallback) {
        super(null);
    }
}