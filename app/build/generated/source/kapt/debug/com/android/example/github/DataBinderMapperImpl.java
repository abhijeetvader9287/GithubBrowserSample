package com.android.example.github;

import android.databinding.DataBinderMapper;
import android.databinding.DataBindingComponent;
import android.databinding.ViewDataBinding;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.android.example.github.databinding.ContributorItemBindingImpl;
import com.android.example.github.databinding.LoadingStateBindingImpl;
import com.android.example.github.databinding.RepoFragmentBindingImpl;
import com.android.example.github.databinding.RepoItemBindingImpl;
import com.android.example.github.databinding.SearchFragmentBindingImpl;
import com.android.example.github.databinding.UserFragmentBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_CONTRIBUTORITEM = 1;

  private static final int LAYOUT_LOADINGSTATE = 2;

  private static final int LAYOUT_REPOFRAGMENT = 3;

  private static final int LAYOUT_REPOITEM = 4;

  private static final int LAYOUT_SEARCHFRAGMENT = 5;

  private static final int LAYOUT_USERFRAGMENT = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.android.example.github.R.layout.contributor_item, LAYOUT_CONTRIBUTORITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.android.example.github.R.layout.loading_state, LAYOUT_LOADINGSTATE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.android.example.github.R.layout.repo_fragment, LAYOUT_REPOFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.android.example.github.R.layout.repo_item, LAYOUT_REPOITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.android.example.github.R.layout.search_fragment, LAYOUT_SEARCHFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.android.example.github.R.layout.user_fragment, LAYOUT_USERFRAGMENT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_CONTRIBUTORITEM: {
          if ("layout/contributor_item_0".equals(tag)) {
            return new ContributorItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for contributor_item is invalid. Received: " + tag);
        }
        case  LAYOUT_LOADINGSTATE: {
          if ("layout/loading_state_0".equals(tag)) {
            return new LoadingStateBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for loading_state is invalid. Received: " + tag);
        }
        case  LAYOUT_REPOFRAGMENT: {
          if ("layout/repo_fragment_0".equals(tag)) {
            return new RepoFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for repo_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_REPOITEM: {
          if ("layout/repo_item_0".equals(tag)) {
            return new RepoItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for repo_item is invalid. Received: " + tag);
        }
        case  LAYOUT_SEARCHFRAGMENT: {
          if ("layout/search_fragment_0".equals(tag)) {
            return new SearchFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for search_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_USERFRAGMENT: {
          if ("layout/user_fragment_0".equals(tag)) {
            return new UserFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for user_fragment is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new com.android.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(16);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "resultCount");
      sKeys.put(2, "searchResource");
      sKeys.put(3, "resource");
      sKeys.put(4, "contributorsStatus");
      sKeys.put(5, "repo");
      sKeys.put(6, "query");
      sKeys.put(7, "repoResource");
      sKeys.put(8, "contributor");
      sKeys.put(9, "callback");
      sKeys.put(10, "loadingMore");
      sKeys.put(11, "showFullName");
      sKeys.put(12, "user");
      sKeys.put(13, "retryCallback");
      sKeys.put(14, "userResource");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/contributor_item_0", com.android.example.github.R.layout.contributor_item);
      sKeys.put("layout/loading_state_0", com.android.example.github.R.layout.loading_state);
      sKeys.put("layout/repo_fragment_0", com.android.example.github.R.layout.repo_fragment);
      sKeys.put("layout/repo_item_0", com.android.example.github.R.layout.repo_item);
      sKeys.put("layout/search_fragment_0", com.android.example.github.R.layout.search_fragment);
      sKeys.put("layout/user_fragment_0", com.android.example.github.R.layout.user_fragment);
    }
  }
}
