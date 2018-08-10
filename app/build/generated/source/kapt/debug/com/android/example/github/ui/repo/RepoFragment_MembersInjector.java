// Generated by Dagger (https://google.github.io/dagger).
package com.android.example.github.ui.repo;

import android.arch.lifecycle.ViewModelProvider;
import com.android.example.github.AppExecutors;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class RepoFragment_MembersInjector implements MembersInjector<RepoFragment> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<AppExecutors> appExecutorsProvider;

  public RepoFragment_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<AppExecutors> appExecutorsProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.appExecutorsProvider = appExecutorsProvider;
  }

  public static MembersInjector<RepoFragment> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<AppExecutors> appExecutorsProvider) {
    return new RepoFragment_MembersInjector(viewModelFactoryProvider, appExecutorsProvider);
  }

  @Override
  public void injectMembers(RepoFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectAppExecutors(instance, appExecutorsProvider.get());
  }

  public static void injectViewModelFactory(
      RepoFragment instance, ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  public static void injectAppExecutors(RepoFragment instance, AppExecutors appExecutors) {
    instance.appExecutors = appExecutors;
  }
}
