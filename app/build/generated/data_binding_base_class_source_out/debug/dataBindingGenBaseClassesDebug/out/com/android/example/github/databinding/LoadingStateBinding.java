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
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.example.github.ui.common.RetryCallback;
import com.android.example.github.vo.Resource;

public abstract class LoadingStateBinding extends ViewDataBinding {
  @NonNull
  public final TextView errorMsg;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final Button retry;

  @Bindable
  protected Resource mResource;

  @Bindable
  protected RetryCallback mCallback;

  protected LoadingStateBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView errorMsg, ProgressBar progressBar, Button retry) {
    super(_bindingComponent, _root, _localFieldCount);
    this.errorMsg = errorMsg;
    this.progressBar = progressBar;
    this.retry = retry;
  }

  public abstract void setResource(@Nullable Resource resource);

  @Nullable
  public Resource getResource() {
    return mResource;
  }

  public abstract void setCallback(@Nullable RetryCallback callback);

  @Nullable
  public RetryCallback getCallback() {
    return mCallback;
  }

  @NonNull
  public static LoadingStateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LoadingStateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LoadingStateBinding>inflate(inflater, com.android.example.github.R.layout.loading_state, root, attachToRoot, component);
  }

  @NonNull
  public static LoadingStateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LoadingStateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LoadingStateBinding>inflate(inflater, com.android.example.github.R.layout.loading_state, null, false, component);
  }

  public static LoadingStateBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static LoadingStateBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (LoadingStateBinding)bind(component, view, com.android.example.github.R.layout.loading_state);
  }
}
