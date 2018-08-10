// Generated by Dagger (https://google.github.io/dagger).
package com.android.example.github.di;

import com.android.example.github.db.GithubDb;
import com.android.example.github.db.RepoDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class AppModule_ProvideRepoDaoFactory implements Factory<RepoDao> {
  private final AppModule module;

  private final Provider<GithubDb> dbProvider;

  public AppModule_ProvideRepoDaoFactory(AppModule module, Provider<GithubDb> dbProvider) {
    this.module = module;
    this.dbProvider = dbProvider;
  }

  @Override
  public RepoDao get() {
    return Preconditions.checkNotNull(
        module.provideRepoDao(dbProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static AppModule_ProvideRepoDaoFactory create(
      AppModule module, Provider<GithubDb> dbProvider) {
    return new AppModule_ProvideRepoDaoFactory(module, dbProvider);
  }

  public static RepoDao proxyProvideRepoDao(AppModule instance, GithubDb db) {
    return Preconditions.checkNotNull(
        instance.provideRepoDao(db), "Cannot return null from a non-@Nullable @Provides method");
  }
}
