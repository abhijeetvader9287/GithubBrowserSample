package com.android.example.github.di;

import android.support.v4.app.Fragment;
import com.android.example.github.ui.user.UserFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = FragmentBuildersModule_ContributeUserFragment.UserFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeUserFragment {
  private FragmentBuildersModule_ContributeUserFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(UserFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      UserFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface UserFragmentSubcomponent extends AndroidInjector<UserFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<UserFragment> {}
  }
}
