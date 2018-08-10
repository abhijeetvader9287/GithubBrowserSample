package com.android.example.github.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.example.github.ui.common.RetryCallback;
import com.android.example.github.vo.Repo;
import com.android.example.github.vo.Resource;
import com.android.example.github.vo.Status;

public abstract class RepoFragmentBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView contributorList;

  @NonNull
  public final TextView description;

  @NonNull
  public final TextView name;

  @Bindable
  protected Repo mRepo;

  @Bindable
  protected Resource mRepoResource;

  @Bindable
  protected Status mContributorsStatus;

  @Bindable
  protected RetryCallback mRetryCallback;

  protected RepoFragmentBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, RecyclerView contributorList, TextView description, TextView name) {
    super(_bindingComponent, _root, _localFieldCount);
    this.contributorList = contributorList;
    this.description = description;
    this.name = name;
  }

  public abstract void setRepo(@Nullable Repo repo);

  @Nullable
  public Repo getRepo() {
    return mRepo;
  }

  public abstract void setRepoResource(@Nullable Resource repoResource);

  @Nullable
  public Resource getRepoResource() {
    return mRepoResource;
  }

  public abstract void setContributorsStatus(@Nullable Status contributorsStatus);

  @Nullable
  public Status getContributorsStatus() {
    return mContributorsStatus;
  }

  public abstract void setRetryCallback(@Nullable RetryCallback retryCallback);

  @Nullable
  public RetryCallback getRetryCallback() {
    return mRetryCallback;
  }

  @NonNull
  public static RepoFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static RepoFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<RepoFragmentBinding>inflate(inflater, com.android.example.github.R.layout.repo_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static RepoFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static RepoFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<RepoFragmentBinding>inflate(inflater, com.android.example.github.R.layout.repo_fragment, null, false, component);
  }

  public static RepoFragmentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static RepoFragmentBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (RepoFragmentBinding)bind(component, view, com.android.example.github.R.layout.repo_fragment);
  }
}
