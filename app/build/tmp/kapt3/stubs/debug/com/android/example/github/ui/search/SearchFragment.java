package com.android.example.github.ui.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0012J\u0010\u00101\u001a\u00020.2\u0006\u00102\u001a\u000203H\u0012J\b\u00104\u001a\u00020.H\u0012J\b\u00105\u001a\u00020.H\u0012J\b\u00106\u001a\u000207H\u0016J\u0012\u00108\u001a\u00020.2\b\u00109\u001a\u0004\u0018\u00010:H\u0016J&\u0010;\u001a\u0004\u0018\u0001032\u0006\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?2\b\u00109\u001a\u0004\u0018\u00010:H\u0016R+\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\r\u001a\u00020\u000e8\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00138V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\u00020\u001bX\u0096\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\u00020\"X\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010\'\u001a\u00020(8\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,\u00a8\u0006@"}, d2 = {"Lcom/android/example/github/ui/search/SearchFragment;", "Landroid/support/v4/app/Fragment;", "Lcom/android/example/github/di/Injectable;", "()V", "<set-?>", "Lcom/android/example/github/ui/common/RepoListAdapter;", "adapter", "getAdapter", "()Lcom/android/example/github/ui/common/RepoListAdapter;", "setAdapter", "(Lcom/android/example/github/ui/common/RepoListAdapter;)V", "adapter$delegate", "Lcom/android/example/github/util/AutoClearedValue;", "appExecutors", "Lcom/android/example/github/AppExecutors;", "getAppExecutors", "()Lcom/android/example/github/AppExecutors;", "setAppExecutors", "(Lcom/android/example/github/AppExecutors;)V", "Lcom/android/example/github/databinding/SearchFragmentBinding;", "binding", "getBinding", "()Lcom/android/example/github/databinding/SearchFragmentBinding;", "setBinding", "(Lcom/android/example/github/databinding/SearchFragmentBinding;)V", "binding$delegate", "dataBindingComponent", "error/NonExistentClass", "getDataBindingComponent", "()Lerror/NonExistentClass;", "setDataBindingComponent", "(Lerror/NonExistentClass;)V", "Lerror/NonExistentClass;", "searchViewModel", "Lcom/android/example/github/ui/search/SearchViewModel;", "getSearchViewModel", "()Lcom/android/example/github/ui/search/SearchViewModel;", "setSearchViewModel", "(Lcom/android/example/github/ui/search/SearchViewModel;)V", "viewModelFactory", "Landroid/arch/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroid/arch/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroid/arch/lifecycle/ViewModelProvider$Factory;)V", "dismissKeyboard", "", "windowToken", "Landroid/os/IBinder;", "doSearch", "v", "Landroid/view/View;", "initRecyclerView", "initSearchInputListener", "navController", "Landroidx/navigation/NavController;", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "app_debug"})
@com.android.example.github.testing.OpenForTesting()
public class SearchFragment extends android.support.v4.app.Fragment implements com.android.example.github.di.Injectable {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public android.arch.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.android.example.github.AppExecutors appExecutors;
    @org.jetbrains.annotations.NotNull()
    private error.NonExistentClass dataBindingComponent;
    @org.jetbrains.annotations.NotNull()
    private final com.android.example.github.util.AutoClearedValue binding$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.android.example.github.util.AutoClearedValue adapter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public com.android.example.github.ui.search.SearchViewModel searchViewModel;
    
    @org.jetbrains.annotations.NotNull()
    public android.arch.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.android.example.github.AppExecutors getAppExecutors() {
        return null;
    }
    
    public void setAppExecutors(@org.jetbrains.annotations.NotNull()
    com.android.example.github.AppExecutors p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public error.NonExistentClass getDataBindingComponent() {
        return null;
    }
    
    public void setDataBindingComponent(@org.jetbrains.annotations.NotNull()
    error.NonExistentClass p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.android.example.github.databinding.SearchFragmentBinding getBinding() {
        return null;
    }
    
    public void setBinding(@org.jetbrains.annotations.NotNull()
    com.android.example.github.databinding.SearchFragmentBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.android.example.github.ui.common.RepoListAdapter getAdapter() {
        return null;
    }
    
    public void setAdapter(@org.jetbrains.annotations.NotNull()
    com.android.example.github.ui.common.RepoListAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.android.example.github.ui.search.SearchViewModel getSearchViewModel() {
        return null;
    }
    
    public void setSearchViewModel(@org.jetbrains.annotations.NotNull()
    com.android.example.github.ui.search.SearchViewModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private void initSearchInputListener() {
    }
    
    private void doSearch(android.view.View v) {
    }
    
    private void initRecyclerView() {
    }
    
    private void dismissKeyboard(android.os.IBinder windowToken) {
    }
    
    /**
     * * Created to be able to override in tests
     */
    @org.jetbrains.annotations.NotNull()
    public androidx.navigation.NavController navController() {
        return null;
    }
    
    public SearchFragment() {
        super();
    }
}