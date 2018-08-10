package com.android.example.github.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.example.github.vo.Repo;

public abstract class RepoItemBinding extends ViewDataBinding {
  @NonNull
  public final TextView desc;

  @NonNull
  public final TextView name;

  @NonNull
  public final TextView stars;

  @Bindable
  protected boolean mShowFullName;

  @Bindable
  protected Repo mRepo;

  protected RepoItemBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView desc, TextView name, TextView stars) {
    super(_bindingComponent, _root, _localFieldCount);
    this.desc = desc;
    this.name = name;
    this.stars = stars;
  }

  public abstract void setShowFullName(boolean showFullName);

  public boolean getShowFullName() {
    return mShowFullName;
  }

  public abstract void setRepo(@Nullable Repo repo);

  @Nullable
  public Repo getRepo() {
    return mRepo;
  }

  @NonNull
  public static RepoItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static RepoItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<RepoItemBinding>inflate(inflater, com.android.example.github.R.layout.repo_item, root, attachToRoot, component);
  }

  @NonNull
  public static RepoItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static RepoItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<RepoItemBinding>inflate(inflater, com.android.example.github.R.layout.repo_item, null, false, component);
  }

  public static RepoItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static RepoItemBinding bind(@NonNull View view, @Nullable DataBindingComponent component) {
    return (RepoItemBinding)bind(component, view, com.android.example.github.R.layout.repo_item);
  }
}
