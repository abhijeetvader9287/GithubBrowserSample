package com.android.example.github.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.example.github.ui.common.RetryCallback;
import com.android.example.github.vo.Resource;

public abstract class SearchFragmentBinding extends ViewDataBinding {
  @NonNull
  public final EditText input;

  @NonNull
  public final ProgressBar loadMoreBar;

  @NonNull
  public final TextView noResultsText;

  @NonNull
  public final RecyclerView repoList;

  @NonNull
  public final TextInputLayout textInputLayout3;

  @Bindable
  protected int mResultCount;

  @Bindable
  protected String mQuery;

  @Bindable
  protected boolean mLoadingMore;

  @Bindable
  protected Resource mSearchResource;

  @Bindable
  protected RetryCallback mCallback;

  protected SearchFragmentBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, EditText input, ProgressBar loadMoreBar, TextView noResultsText,
      RecyclerView repoList, TextInputLayout textInputLayout3) {
    super(_bindingComponent, _root, _localFieldCount);
    this.input = input;
    this.loadMoreBar = loadMoreBar;
    this.noResultsText = noResultsText;
    this.repoList = repoList;
    this.textInputLayout3 = textInputLayout3;
  }

  public abstract void setResultCount(int resultCount);

  public int getResultCount() {
    return mResultCount;
  }

  public abstract void setQuery(@Nullable String query);

  @Nullable
  public String getQuery() {
    return mQuery;
  }

  public abstract void setLoadingMore(boolean loadingMore);

  public boolean getLoadingMore() {
    return mLoadingMore;
  }

  public abstract void setSearchResource(@Nullable Resource searchResource);

  @Nullable
  public Resource getSearchResource() {
    return mSearchResource;
  }

  public abstract void setCallback(@Nullable RetryCallback callback);

  @Nullable
  public RetryCallback getCallback() {
    return mCallback;
  }

  @NonNull
  public static SearchFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SearchFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SearchFragmentBinding>inflate(inflater, com.android.example.github.R.layout.search_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static SearchFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SearchFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SearchFragmentBinding>inflate(inflater, com.android.example.github.R.layout.search_fragment, null, false, component);
  }

  public static SearchFragmentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static SearchFragmentBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (SearchFragmentBinding)bind(component, view, com.android.example.github.R.layout.search_fragment);
  }
}
