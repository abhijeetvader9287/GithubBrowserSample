package com.android.example.github.databinding;
import com.android.example.github.R;
import com.android.example.github.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RepoItemBindingImpl extends RepoItemBinding  {

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

    public RepoItemBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private RepoItemBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            );
        this.desc.setTag(null);
        this.mboundView0 = (android.support.v7.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.name.setTag(null);
        this.stars.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.repo == variableId) {
            setRepo((com.android.example.github.vo.Repo) variable);
        }
        else if (BR.showFullName == variableId) {
            setShowFullName((boolean) variable);
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
    public void setShowFullName(boolean ShowFullName) {
        this.mShowFullName = ShowFullName;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.showFullName);
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
        com.android.example.github.vo.Repo repo = mRepo;
        java.lang.String javaLangStringRepoStars = null;
        java.lang.String showFullNameRepoFullNameRepoName = null;
        java.lang.String repoFullName = null;
        boolean showFullName = mShowFullName;
        java.lang.String repoDescription = null;
        int repoStars = 0;
        java.lang.String repoName = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (repo != null) {
                    // read repo.description
                    repoDescription = repo.getDescription();
                    // read repo.stars
                    repoStars = repo.getStars();
                }


                // read ("") + (repo.stars)
                javaLangStringRepoStars = ("") + (repoStars);
        }
        if ((dirtyFlags & 0x7L) != 0) {

            if((dirtyFlags & 0x7L) != 0) {
                if(showFullName) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x18L) != 0) {


            if ((dirtyFlags & 0x10L) != 0) {

                    if (repo != null) {
                        // read repo.fullName
                        repoFullName = repo.getFullName();
                    }
            }
            if ((dirtyFlags & 0x8L) != 0) {

                    if (repo != null) {
                        // read repo.name
                        repoName = repo.getName();
                    }
            }
        }

        if ((dirtyFlags & 0x7L) != 0) {

                // read showFullName ? repo.fullName : repo.name
                showFullNameRepoFullNameRepoName = ((showFullName) ? (repoFullName) : (repoName));
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.desc, repoDescription);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.stars, javaLangStringRepoStars);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.name, showFullNameRepoFullNameRepoName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): repo
        flag 1 (0x2L): showFullName
        flag 2 (0x3L): null
        flag 3 (0x4L): showFullName ? repo.fullName : repo.name
        flag 4 (0x5L): showFullName ? repo.fullName : repo.name
    flag mapping end*/
    //end
}