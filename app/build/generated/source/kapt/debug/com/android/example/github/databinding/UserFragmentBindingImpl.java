package com.android.example.github.databinding;
import com.android.example.github.R;
import com.android.example.github.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class UserFragmentBindingImpl extends UserFragmentBinding implements com.android.example.github.generated.callback.RetryCallback.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(6);
        sIncludes.setIncludes(0, 
            new String[] {"loading_state"},
            new int[] {4},
            new int[] {R.layout.loading_state});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.repo_list, 5);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    @Nullable
    private final com.android.example.github.databinding.LoadingStateBinding mboundView01;
    // variables
    @Nullable
    private final com.android.example.github.ui.common.RetryCallback mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public UserFragmentBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private UserFragmentBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[2]
            , (android.widget.LinearLayout) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.support.v7.widget.RecyclerView) bindings[5]
            );
        ensureBindingComponentIsNotNull(com.android.example.github.binding.FragmentBindingAdapters.class);
        this.avatar.setTag(null);
        this.header.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView01 = (com.android.example.github.databinding.LoadingStateBinding) bindings[4];
        setContainedBinding(this.mboundView01);
        this.name.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new com.android.example.github.generated.callback.RetryCallback(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.userResource == variableId) {
            setUserResource((com.android.example.github.vo.Resource) variable);
        }
        else if (BR.retryCallback == variableId) {
            setRetryCallback((com.android.example.github.ui.common.RetryCallback) variable);
        }
        else if (BR.user == variableId) {
            setUser((com.android.example.github.vo.User) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUserResource(@Nullable com.android.example.github.vo.Resource UserResource) {
        this.mUserResource = UserResource;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.userResource);
        super.requestRebind();
    }
    public void setRetryCallback(@Nullable com.android.example.github.ui.common.RetryCallback RetryCallback) {
        this.mRetryCallback = RetryCallback;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.retryCallback);
        super.requestRebind();
    }
    public void setUser(@Nullable com.android.example.github.vo.User User) {
        this.mUser = User;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.user);
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
        boolean userNameJavaLangObjectNull = false;
        java.lang.String userName = null;
        com.android.example.github.vo.Resource userResource = mUserResource;
        com.android.example.github.ui.common.RetryCallback retryCallback = mRetryCallback;
        com.android.example.github.vo.User user = mUser;
        java.lang.String userNameJavaLangObjectNullUserLoginUserName = null;
        boolean userJavaLangObjectNull = false;
        java.lang.String userAvatarUrl = null;
        java.lang.String userLogin = null;

        if ((dirtyFlags & 0x9L) != 0) {
        }
        if ((dirtyFlags & 0xcL) != 0) {



                if (user != null) {
                    // read user.name
                    userName = user.getName();
                    // read user.avatarUrl
                    userAvatarUrl = user.getAvatarUrl();
                }
                // read user != null
                userJavaLangObjectNull = (user) != (null);


                // read user.name == null
                userNameJavaLangObjectNull = (userName) == (null);
            if((dirtyFlags & 0xcL) != 0) {
                if(userNameJavaLangObjectNull) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x20L) != 0) {

                if (user != null) {
                    // read user.login
                    userLogin = user.getLogin();
                }
        }

        if ((dirtyFlags & 0xcL) != 0) {

                // read user.name == null ? user.login : user.name
                userNameJavaLangObjectNullUserLoginUserName = ((userNameJavaLangObjectNull) ? (userLogin) : (userName));
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.mBindingComponent.getFragmentBindingAdapters().bindImage(this.avatar, userAvatarUrl);
            com.android.example.github.binding.BindingAdapters.showHide(this.header, userJavaLangObjectNull);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.name, userNameJavaLangObjectNullUserLoginUserName);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            this.mboundView01.setResource(userResource);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.mboundView01.setCallback(mCallback4);
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
        flag 0 (0x1L): userResource
        flag 1 (0x2L): retryCallback
        flag 2 (0x3L): user
        flag 3 (0x4L): null
        flag 4 (0x5L): user.name == null ? user.login : user.name
        flag 5 (0x6L): user.name == null ? user.login : user.name
    flag mapping end*/
    //end
}