package com.android.example.github.ui.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u000eH\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0092\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00100\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\t\u00a8\u0006\u001b"}, d2 = {"Lcom/android/example/github/ui/search/SearchViewModel;", "Landroid/arch/lifecycle/ViewModel;", "repoRepository", "Lcom/android/example/github/repository/RepoRepository;", "(Lcom/android/example/github/repository/RepoRepository;)V", "loadMoreStatus", "Landroid/arch/lifecycle/LiveData;", "Lcom/android/example/github/ui/search/SearchViewModel$LoadMoreState;", "getLoadMoreStatus", "()Landroid/arch/lifecycle/LiveData;", "nextPageHandler", "Lcom/android/example/github/ui/search/SearchViewModel$NextPageHandler;", "query", "Landroid/arch/lifecycle/MutableLiveData;", "", "results", "Lcom/android/example/github/vo/Resource;", "", "Lcom/android/example/github/vo/Repo;", "getResults", "loadNextPage", "", "refresh", "setQuery", "originalInput", "LoadMoreState", "NextPageHandler", "app_debug"})
@com.android.example.github.testing.OpenForTesting()
public class SearchViewModel extends android.arch.lifecycle.ViewModel {
    private final android.arch.lifecycle.MutableLiveData<java.lang.String> query = null;
    private final com.android.example.github.ui.search.SearchViewModel.NextPageHandler nextPageHandler = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.LiveData<com.android.example.github.vo.Resource<java.util.List<com.android.example.github.vo.Repo>>> results = null;
    
    @org.jetbrains.annotations.NotNull()
    public android.arch.lifecycle.LiveData<com.android.example.github.vo.Resource<java.util.List<com.android.example.github.vo.Repo>>> getResults() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public android.arch.lifecycle.LiveData<com.android.example.github.ui.search.SearchViewModel.LoadMoreState> getLoadMoreStatus() {
        return null;
    }
    
    public void setQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String originalInput) {
    }
    
    public void loadNextPage() {
    }
    
    public void refresh() {
    }
    
    @javax.inject.Inject()
    public SearchViewModel(@org.jetbrains.annotations.NotNull()
    com.android.example.github.repository.RepoRepository repoRepository) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u00058F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\bR\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/android/example/github/ui/search/SearchViewModel$LoadMoreState;", "", "isRunning", "", "errorMessage", "", "(ZLjava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "errorMessageIfNotHandled", "getErrorMessageIfNotHandled", "handledError", "()Z", "app_debug"})
    public static final class LoadMoreState {
        private boolean handledError;
        private final boolean isRunning = false;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String errorMessage = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getErrorMessageIfNotHandled() {
            return null;
        }
        
        public final boolean isRunning() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getErrorMessage() {
            return null;
        }
        
        public LoadMoreState(boolean isRunning, @org.jetbrains.annotations.Nullable()
        java.lang.String errorMessage) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0018\u001a\u00020\u0015J\b\u0010\u0019\u001a\u00020\u0015H\u0002R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/android/example/github/ui/search/SearchViewModel$NextPageHandler;", "Landroid/arch/lifecycle/Observer;", "Lcom/android/example/github/vo/Resource;", "", "repository", "Lcom/android/example/github/repository/RepoRepository;", "(Lcom/android/example/github/repository/RepoRepository;)V", "_hasMore", "hasMore", "getHasMore", "()Z", "loadMoreState", "Landroid/arch/lifecycle/MutableLiveData;", "Lcom/android/example/github/ui/search/SearchViewModel$LoadMoreState;", "getLoadMoreState", "()Landroid/arch/lifecycle/MutableLiveData;", "nextPageLiveData", "Landroid/arch/lifecycle/LiveData;", "query", "", "onChanged", "", "result", "queryNextPage", "reset", "unregister", "app_debug"})
    public static final class NextPageHandler implements android.arch.lifecycle.Observer<com.android.example.github.vo.Resource<? extends java.lang.Boolean>> {
        private android.arch.lifecycle.LiveData<com.android.example.github.vo.Resource<java.lang.Boolean>> nextPageLiveData;
        @org.jetbrains.annotations.NotNull()
        private final android.arch.lifecycle.MutableLiveData<com.android.example.github.ui.search.SearchViewModel.LoadMoreState> loadMoreState = null;
        private java.lang.String query;
        private boolean _hasMore;
        private final com.android.example.github.repository.RepoRepository repository = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.arch.lifecycle.MutableLiveData<com.android.example.github.ui.search.SearchViewModel.LoadMoreState> getLoadMoreState() {
            return null;
        }
        
        public final boolean getHasMore() {
            return false;
        }
        
        public final void queryNextPage(@org.jetbrains.annotations.NotNull()
        java.lang.String query) {
        }
        
        @java.lang.Override()
        public void onChanged(@org.jetbrains.annotations.Nullable()
        com.android.example.github.vo.Resource<java.lang.Boolean> result) {
        }
        
        private final void unregister() {
        }
        
        public final void reset() {
        }
        
        public NextPageHandler(@org.jetbrains.annotations.NotNull()
        com.android.example.github.repository.RepoRepository repository) {
            super();
        }
    }
}