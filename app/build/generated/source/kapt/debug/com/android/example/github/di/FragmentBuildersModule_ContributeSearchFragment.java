package com.android.example.github.di;

import android.support.v4.app.Fragment;
import com.android.example.github.ui.search.SearchFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = FragmentBuildersModule_ContributeSearchFragment.SearchFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeSearchFragment {
  private FragmentBuildersModule_ContributeSearchFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(SearchFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      SearchFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface SearchFragmentSubcomponent extends AndroidInjector<SearchFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SearchFragment> {}
  }
}
