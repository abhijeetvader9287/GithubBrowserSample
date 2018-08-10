// Generated by Dagger (https://google.github.io/dagger).
package com.android.example.github.repository;

import com.android.example.github.AppExecutors;
import com.android.example.github.api.GithubService;
import com.android.example.github.db.GithubDb;
import com.android.example.github.db.RepoDao;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RepoRepository_Factory implements Factory<RepoRepository> {
  private final Provider<AppExecutors> appExecutorsProvider;

  private final Provider<GithubDb> dbProvider;

  private final Provider<RepoDao> repoDaoProvider;

  private final Provider<GithubService> githubServiceProvider;

  public RepoRepository_Factory(
      Provider<AppExecutors> appExecutorsProvider,
      Provider<GithubDb> dbProvider,
      Provider<RepoDao> repoDaoProvider,
      Provider<GithubService> githubServiceProvider) {
    this.appExecutorsProvider = appExecutorsProvider;
    this.dbProvider = dbProvider;
    this.repoDaoProvider = repoDaoProvider;
    this.githubServiceProvider = githubServiceProvider;
  }

  @Override
  public RepoRepository get() {
    return new RepoRepository(
        appExecutorsProvider.get(),
        dbProvider.get(),
        repoDaoProvider.get(),
        githubServiceProvider.get());
  }

  public static RepoRepository_Factory create(
      Provider<AppExecutors> appExecutorsProvider,
      Provider<GithubDb> dbProvider,
      Provider<RepoDao> repoDaoProvider,
      Provider<GithubService> githubServiceProvider) {
    return new RepoRepository_Factory(
        appExecutorsProvider, dbProvider, repoDaoProvider, githubServiceProvider);
  }
}
