package com.android.example.github.databinding;
import com.android.example.github.R;
import com.android.example.github.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LoadingStateBindingImpl extends LoadingStateBinding implements com.android.example.github.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LoadingStateBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private LoadingStateBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.widget.ProgressBar) bindings[1]
            , (android.widget.Button) bindings[2]
            );
        this.errorMsg.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progressBar.setTag(null);
        this.retry.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.android.example.github.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.callback == variableId) {
            setCallback((com.android.example.github.ui.common.RetryCallback) variable);
        }
        else if (BR.resource == variableId) {
            setResource((com.android.example.github.vo.Resource) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCallback(@Nullable com.android.example.github.ui.common.RetryCallback Callback) {
        this.mCallback = Callback;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.callback);
        super.requestRebind();
    }
    public void setResource(@Nullable com.android.example.github.vo.Resource Resource) {
        this.mResource = Resource;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.resource);
        super.requestRebind();
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
        boolean resourceDataJavaLangObjectNull = false;
        java.lang.String resourceMessage = null;
        com.android.example.github.ui.common.RetryCallback callback = mCallback;
        boolean resourceMessageJavaLangObjectNull = false;
        boolean resourceStatusStatusLOADING = false;
        com.android.example.github.vo.Resource resource = mResource;
        com.android.example.github.vo.Status resourceStatus = null;
        java.lang.String resourceMessageJavaLangObjectNullErrorMsgAndroidStringUnknownErrorResourceMessage = null;
        java.lang.Object resourceData = null;
        boolean resourceStatusStatusERROR = false;

        if ((dirtyFlags & 0x6L) != 0) {



                if (resource != null) {
                    // read resource.message
                    resourceMessage = resource.getMessage();
                    // read resource.status
                    resourceStatus = resource.getStatus();
                    // read resource.data
                    resourceData = resource.getData();
                }


                // read resource.message == null
                resourceMessageJavaLangObjectNull = (resourceMessage) == (null);
                // read resource.status == Status.LOADING
                resourceStatusStatusLOADING = (resourceStatus) == (com.android.example.github.vo.Status.LOADING);
                // read resource.status == Status.ERROR
                resourceStatusStatusERROR = (resourceStatus) == (com.android.example.github.vo.Status.ERROR);
                // read resource.data == null
                resourceDataJavaLangObjectNull = (resourceData) == (null);
            if((dirtyFlags & 0x6L) != 0) {
                if(resourceMessageJavaLangObjectNull) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x6L) != 0) {

                // read resource.message == null ? @android:string/unknown_error : resource.message
                resourceMessageJavaLangObjectNullErrorMsgAndroidStringUnknownErrorResourceMessage = ((resourceMessageJavaLangObjectNull) ? (errorMsg.getResources().getString(R.string.unknown_error)) : (resourceMessage));
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.errorMsg, resourceMessageJavaLangObjectNullErrorMsgAndroidStringUnknownErrorResourceMessage);
            com.android.example.github.binding.BindingAdapters.showHide(this.errorMsg, resourceStatusStatusERROR);
            com.android.example.github.binding.BindingAdapters.showHide(this.mboundView0, resourceDataJavaLangObjectNull);
            com.android.example.github.binding.BindingAdapters.showHide(this.progressBar, resourceStatusStatusLOADING);
            com.android.example.github.binding.BindingAdapters.showHide(this.retry, resourceStatusStatusERROR);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.retry.setOnClickListener(mCallback2);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
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
        flag 0 (0x1L): callback
        flag 1 (0x2L): resource
        flag 2 (0x3L): null
        flag 3 (0x4L): resource.message == null ? @android:string/unknown_error : resource.message
        flag 4 (0x5L): resource.message == null ? @android:string/unknown_error : resource.message
    flag mapping end*/
    //end
}