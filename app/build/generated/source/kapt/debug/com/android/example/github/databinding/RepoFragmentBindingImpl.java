package com.android.example.github.databinding;
import com.android.example.github.R;
import com.android.example.github.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RepoFragmentBindingImpl extends RepoFragmentBinding implements com.android.example.github.generated.callback.RetryCallback.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(5);
        sIncludes.setIncludes(0, 
            new String[] {"loading_state"},
            new int[] {3},
            new int[] {R.layout.loading_state});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.contributor_list, 4);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    @Nullable
    private final com.android.example.github.databinding.LoadingStateBinding mboundView01;
    // variables
    @Nullable
    private final com.android.example.github.ui.common.RetryCallback mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RepoFragmentBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private RepoFragmentBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.support.v7.widget.RecyclerView) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.description.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView01 = (com.android.example.github.databinding.LoadingStateBinding) bindings[3];
        setContainedBinding(this.mboundView01);
        this.name.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.android.example.github.generated.callback.RetryCallback(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.repo == variableId) {
            setRepo((com.android.example.github.vo.Repo) variable);
        }
        else if (BR.repoResource == variableId) {
            setRepoResource((com.android.example.github.vo.Resource) variable);
        }
        else if (BR.retryCallback == variableId) {
            setRetryCallback((com.android.example.github.ui.common.RetryCallback) variable);
        }
        else if (BR.contributorsStatus == variableId) {
            setContributorsStatus((com.android.example.github.vo.Status) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRepo(@Nullable com.android.example.github.vo.Repo Repo) {
        this.mRepo = Repo;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.repo);
        super.requestRebind();
    }
    public void setRepoResource(@Nullable com.android.example.github.vo.Resource RepoResource) {
        this.mRepoResource = RepoResource;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.repoResource);
        super.requestRebind();
    }
    public void setRetryCallback(@Nullable com.android.example.github.ui.common.RetryCallback RetryCallback) {
        this.mRetryCallback = RetryCallback;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.retryCallback);
        super.requestRebind();
    }
    public void setContributorsStatus(@Nullable com.android.example.github.vo.Status ContributorsStatus) {
        this.mContributorsStatus = ContributorsStatus;
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
        com.android.example.github.vo.Repo repo = mRepo;
        com.android.example.github.vo.Repo.Owner repoOwner = null;
        com.android.example.github.vo.Resource repoResource = mRepoResource;
        java.lang.String repoOwnerLogin = null;
        com.android.example.github.ui.common.RetryCallback retryCallback = mRetryCallback;
        boolean repoJavaLangObjectNull = false;
        java.lang.String repoDescription = null;
        java.lang.String repoName = null;
        java.lang.String nameAndroidStringRepoFullNameRepoOwnerLoginRepoName = null;

        if ((dirtyFlags & 0x11L) != 0) {



                if (repo != null) {
                    // read repo.owner
                    repoOwner = repo.getOwner();
                    // read repo.description
                    repoDescription = repo.getDescription();
                    // read repo.name
                    repoName = repo.getName();
                }
                // read repo != null
                repoJavaLangObjectNull = (repo) != (null);


                if (repoOwner != null) {
                    // read repo.owner.login
                    repoOwnerLogin = repoOwner.getLogin();
                }


                // read @android:string/repo_full_name
                nameAndroidStringRepoFullNameRepoOwnerLoginRepoName = name.getResources().getString(R.string.repo_full_name, repoOwnerLogin, repoName);
        }
        if ((dirtyFlags & 0x12L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            com.android.example.github.binding.BindingAdapters.showHide(this.description, repoJavaLangObjectNull);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.description, repoDescription);
            com.android.example.github.binding.BindingAdapters.showHide(this.name, repoJavaLangObjectNull);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.name, nameAndroidStringRepoFullNameRepoOwnerLoginRepoName);
        }
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            this.mboundView01.setResource(repoResource);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.mboundView01.setCallback(mCallback3);
        }
        executeBindingsOn(mboundView01);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackRetry(int sourceId ) {
        // localize variables for thread safety
        // retryCallback
        com.android.example.github.ui.common.RetryCallback retryCallback = mRetryCallback;
        // retryCallback != null
        boolean retryCallbackJavaLangObjectNull = false;



        retryCallbackJavaLangObjectNull = (retryCallback) != (null);
        if (retryCallbackJavaLangObjectNull) {


            retryCallback.retry();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): repo
        flag 1 (0x2L): repoResource
        flag 2 (0x3L): retryCallback
        flag 3 (0x4L): contributorsStatus
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}