package com.android.example.github.di;

import android.support.v4.app.Fragment;
import com.android.example.github.ui.repo.RepoFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = FragmentBuildersModule_ContributeRepoFragment.RepoFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeRepoFragment {
  private FragmentBuildersModule_ContributeRepoFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(RepoFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      RepoFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface RepoFragmentSubcomponent extends AndroidInjector<RepoFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<RepoFragment> {}
  }
}
