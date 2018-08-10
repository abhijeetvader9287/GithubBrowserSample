package com.android.example.github.databinding;
import com.android.example.github.R;
import com.android.example.github.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SearchFragmentBindingImpl extends SearchFragmentBinding implements com.android.example.github.generated.callback.RetryCallback.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(7);
        sIncludes.setIncludes(0, 
            new String[] {"loading_state"},
            new int[] {3},
            new int[] {R.layout.loading_state});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textInputLayout3, 4);
        sViewsWithIds.put(R.id.input, 5);
        sViewsWithIds.put(R.id.repo_list, 6);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    @Nullable
    private final com.android.example.github.databinding.LoadingStateBinding mboundView01;
    // variables
    @Nullable
    private final com.android.example.github.ui.common.RetryCallback mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SearchFragmentBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private SearchFragmentBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.EditText) bindings[5]
            , (android.widget.ProgressBar) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.support.v7.widget.RecyclerView) bindings[6]
            , (android.support.design.widget.TextInputLayout) bindings[4]
            );
        this.loadMoreBar.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView01 = (com.android.example.github.databinding.LoadingStateBinding) bindings[3];
        setContainedBinding(this.mboundView01);
        this.noResultsText.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.android.example.github.generated.callback.RetryCallback(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        mboundView01.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView01.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.searchResource == variableId) {
            setSearchResource((com.android.example.github.vo.Resource) variable);
        }
        else if (BR.callback == variableId) {
            setCallback((com.android.example.github.ui.common.RetryCallback) variable);
        }
        else if (BR.loadingMore == variableId) {
            setLoadingMore((boolean) variable);
        }
        else if (BR.query == variableId) {
            setQuery((java.lang.String) variable);
        }
        else if (BR.resultCount == variableId) {
            setResultCount((int) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSearchResource(@Nullable com.android.example.github.vo.Resource SearchResource) {
        this.mSearchResource = SearchResource;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.searchResource);
        super.requestRebind();
    }
    public void setCallback(@Nullable com.android.example.github.ui.common.RetryCallback Callback) {
        this.mCallback = Callback;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.callback);
        super.requestRebind();
    }
    public void setLoadingMore(boolean LoadingMore) {
        this.mLoadingMore = LoadingMore;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.loadingMore);
        super.requestRebind();
    }
    public void setQuery(@Nullable java.lang.String Query) {
        this.mQuery = Query;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.query);
        super.requestRebind();
    }
    public void setResultCount(int ResultCount) {
        this.mResultCount = ResultCount;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.resultCount);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable android.arch.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView01.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.android.example.github.vo.Resource searchResource = mSearchResource;
        boolean resultCountInt0 = false;
        com.android.example.github.ui.common.RetryCallback callback = mCallback;
        boolean searchResourceStatusStatusSUCCESSResultCountInt0BooleanFalse = false;
        boolean loadingMore = mLoadingMore;
        com.android.example.github.vo.Status searchResourceStatus = null;
        java.lang.String noResultsTextAndroidStringEmptySearchResultQuery = null;
        java.lang.String query = mQuery;
        boolean searchResourceStatusStatusSUCCESS = false;
        int resultCount = mResultCount;

        if ((dirtyFlags & 0x31L) != 0) {



                if (searchResource != null) {
                    // read searchResource.status
                    searchResourceStatus = searchResource.getStatus();
                }


                // read searchResource.status == Status.SUCCESS
                searchResourceStatusStatusSUCCESS = (searchResourceStatus) == (com.android.example.github.vo.Status.SUCCESS);
            if((dirtyFlags & 0x31L) != 0) {
                if(searchResourceStatusStatusSUCCESS) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
        }
        if ((dirtyFlags & 0x24L) != 0) {
        }
        if ((dirtyFlags & 0x28L) != 0) {



                // read @android:string/empty_search_result
                noResultsTextAndroidStringEmptySearchResultQuery = noResultsText.getResources().getString(R.string.empty_search_result, query);
        }
        // batch finished

        if ((dirtyFlags & 0x80L) != 0) {



                // read resultCount == 0
                resultCountInt0 = (resultCount) == (0);
        }

        if ((dirtyFlags & 0x31L) != 0) {

                // read searchResource.status == Status.SUCCESS ? resultCount == 0 : false
                searchResourceStatusStatusSUCCESSResultCountInt0BooleanFalse = ((searchResourceStatusStatusSUCCESS) ? (resultCountInt0) : (false));
        }
        // batch finished
        if ((dirtyFlags & 0x24L) != 0) {
            // api target 1

            com.android.example.github.binding.BindingAdapters.showHide(this.loadMoreBar, loadingMore);
        }
        if ((dirtyFlags & 0x21L) != 0) {
            // api target 1

            this.mboundView01.setResource(searchResource);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.mboundView01.setCallback(mCallback1);
        }
        if ((dirtyFlags & 0x28L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.noResultsText, noResultsTextAndroidStringEmptySearchResultQuery);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            com.android.example.github.binding.BindingAdapters.showHide(this.noResultsText, searchResourceStatusStatusSUCCESSResultCountInt0BooleanFalse);
        }
        executeBindingsOn(mboundView01);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackRetry(int sourceId ) {
        // localize variables for thread safety
        // callback
        com.android.example.github.ui.common.RetryCallback callback = mCallback;
        // callback != null
        boolean callbackJavaLangObjectNull = false;



        callbackJavaLangObjectNull = (callback) != (null);
        if (callbackJavaLangObjectNull) {


            callback.retry();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): searchResource
        flag 1 (0x2L): callback
        flag 2 (0x3L): loadingMore
        flag 3 (0x4L): query
        flag 4 (0x5L): resultCount
        flag 5 (0x6L): null
        flag 6 (0x7L): searchResource.status == Status.SUCCESS ? resultCount == 0 : false
        flag 7 (0x8L): searchResource.status == Status.SUCCESS ? resultCount == 0 : false
    flag mapping end*/
    //end
}