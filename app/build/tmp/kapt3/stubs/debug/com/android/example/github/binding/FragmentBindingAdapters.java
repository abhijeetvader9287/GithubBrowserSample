package com.android.example.github.binding;

import java.lang.System;

/**
 * * Binding adapters that work with a fragment instance.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/android/example/github/binding/FragmentBindingAdapters;", "", "fragment", "Landroid/support/v4/app/Fragment;", "(Landroid/support/v4/app/Fragment;)V", "getFragment", "()Landroid/support/v4/app/Fragment;", "bindImage", "", "imageView", "Landroid/widget/ImageView;", "url", "", "app_debug"})
@com.android.example.github.testing.OpenForTesting()
public class FragmentBindingAdapters {
    @org.jetbrains.annotations.NotNull()
    private final android.support.v4.app.Fragment fragment = null;
    
    @android.databinding.BindingAdapter(value = {"imageUrl"})
    public void bindImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public android.support.v4.app.Fragment getFragment() {
        return null;
    }
    
    @javax.inject.Inject()
    public FragmentBindingAdapters(@org.jetbrains.annotations.NotNull()
    android.support.v4.app.Fragment fragment) {
        super();
    }
}