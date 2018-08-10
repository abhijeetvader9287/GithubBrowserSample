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
import android.widget.ImageView;
import android.widget.TextView;
import com.android.example.github.vo.Contributor;

public abstract class ContributorItemBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView textView;

  @Bindable
  protected Contributor mContributor;

  protected ContributorItemBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView imageView, TextView textView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageView = imageView;
    this.textView = textView;
  }

  public abstract void setContributor(@Nullable Contributor contributor);

  @Nullable
  public Contributor getContributor() {
    return mContributor;
  }

  @NonNull
  public static ContributorItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ContributorItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ContributorItemBinding>inflate(inflater, com.android.example.github.R.layout.contributor_item, root, attachToRoot, component);
  }

  @NonNull
  public static ContributorItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ContributorItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ContributorItemBinding>inflate(inflater, com.android.example.github.R.layout.contributor_item, null, false, component);
  }

  public static ContributorItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ContributorItemBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ContributorItemBinding)bind(component, view, com.android.example.github.R.layout.contributor_item);
  }
}
