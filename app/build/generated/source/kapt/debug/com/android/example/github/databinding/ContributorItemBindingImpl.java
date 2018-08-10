package com.android.example.github.databinding;
import com.android.example.github.R;
import com.android.example.github.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ContributorItemBindingImpl extends ContributorItemBinding  {

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
    private final android.support.v7.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ContributorItemBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ContributorItemBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        ensureBindingComponentIsNotNull(com.android.example.github.binding.FragmentBindingAdapters.class);
        this.imageView.setTag(null);
        this.mboundView0 = (android.support.v7.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.textView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.contributor == variableId) {
            setContributor((com.android.example.github.vo.Contributor) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setContributor(@Nullable com.android.example.github.vo.Contributor Contributor) {
        this.mContributor = Contributor;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.contributor);
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
        com.android.example.github.vo.Contributor contributor = mContributor;
        java.lang.String contributorAvatarUrl = null;
        java.lang.String contributorLogin = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (contributor != null) {
                    // read contributor.avatarUrl
                    contributorAvatarUrl = contributor.getAvatarUrl();
                    // read contributor.login
                    contributorLogin = contributor.getLogin();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.mBindingComponent.getFragmentBindingAdapters().bindImage(this.imageView, contributorAvatarUrl);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.textView, contributorLogin);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): contributor
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}