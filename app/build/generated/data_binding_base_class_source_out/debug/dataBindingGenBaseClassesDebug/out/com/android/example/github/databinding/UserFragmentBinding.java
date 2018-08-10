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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.example.github.ui.common.RetryCallback;
import com.android.example.github.vo.Resource;
import com.android.example.github.vo.User;

public abstract class UserFragmentBinding extends ViewDataBinding {
  @NonNull
  public final ImageView avatar;

  @NonNull
  public final LinearLayout header;

  @NonNull
  public final TextView name;

  @NonNull
  public final RecyclerView repoList;

  @Bindable
  protected User mUser;

  @Bindable
  protected Resource mUserResource;

  @Bindable
  protected RetryCallback mRetryCallback;

  protected UserFragmentBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView avatar, LinearLayout header, TextView name,
      RecyclerView repoList) {
    super(_bindingComponent, _root, _localFieldCount);
    this.avatar = avatar;
    this.header = header;
    this.name = name;
    this.repoList = repoList;
  }

  public abstract void setUser(@Nullable User user);

  @Nullable
  public User getUser() {
    return mUser;
  }

  public abstract void setUserResource(@Nullable Resource userResource);

  @Nullable
  public Resource getUserResource() {
    return mUserResource;
  }

  public abstract void setRetryCallback(@Nullable RetryCallback retryCallback);

  @Nullable
  public RetryCallback getRetryCallback() {
    return mRetryCallback;
  }

  @NonNull
  public static UserFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static UserFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<UserFragmentBinding>inflate(inflater, com.android.example.github.R.layout.user_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static UserFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static UserFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<UserFragmentBinding>inflate(inflater, com.android.example.github.R.layout.user_fragment, null, false, component);
  }

  public static UserFragmentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static UserFragmentBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (UserFragmentBinding)bind(component, view, com.android.example.github.R.layout.user_fragment);
  }
}
