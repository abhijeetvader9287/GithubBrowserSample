package com.android.example.github.ui.repo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class RepoFragmentArgs {
  @NonNull
  private String owner;

  @NonNull
  private String name;

  private RepoFragmentArgs() {
  }

  @NonNull
  public static RepoFragmentArgs fromBundle(Bundle bundle) {
    RepoFragmentArgs result = new RepoFragmentArgs();
    bundle.setClassLoader(RepoFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("owner")) {
      result.owner = bundle.getString("owner");
      if (result.owner == null) {
        throw new IllegalArgumentException("Argument \"owner\" is marked as non-null but was passed a null value.");
      }
    } else {
      throw new IllegalArgumentException("Required argument \"owner\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("name")) {
      result.name = bundle.getString("name");
      if (result.name == null) {
        throw new IllegalArgumentException("Argument \"name\" is marked as non-null but was passed a null value.");
      }
    } else {
      throw new IllegalArgumentException("Required argument \"name\" is missing and does not have an android:defaultValue");
    }
    return result;
  }

  @NonNull
  public String getOwner() {
    return owner;
  }

  @NonNull
  public String getName() {
    return name;
  }

  @NonNull
  public Bundle toBundle() {
    Bundle __outBundle = new Bundle();
    __outBundle.putString("owner", this.owner);
    __outBundle.putString("name", this.name);
    return __outBundle;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    if (!super.equals(object)) {
        return false;
    }
    RepoFragmentArgs that = (RepoFragmentArgs) object;
    if (owner != null ? !owner.equals(that.owner) : that.owner != null) {
      return false;
    }
    if (name != null ? !name.equals(that.name) : that.name != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (owner != null ? owner.hashCode() : 0);
    result = 31 * result + (name != null ? name.hashCode() : 0);
    return result;
  }

  public static class Builder {
    @NonNull
    private String owner;

    @NonNull
    private String name;

    public Builder(RepoFragmentArgs original) {
      this.owner = original.owner;
      this.name = original.name;
    }

    public Builder(@NonNull String owner, @NonNull String name) {
      this.owner = owner;
      if (this.owner == null) {
        throw new IllegalArgumentException("Argument \"owner\" is marked as non-null but was passed a null value.");
      }
      this.name = name;
      if (this.name == null) {
        throw new IllegalArgumentException("Argument \"name\" is marked as non-null but was passed a null value.");
      }
    }

    @NonNull
    public RepoFragmentArgs build() {
      RepoFragmentArgs result = new RepoFragmentArgs();
      result.owner = this.owner;
      result.name = this.name;
      return result;
    }

    @NonNull
    public Builder setOwner(@NonNull String owner) {
      if (owner == null) {
        throw new IllegalArgumentException("Argument \"owner\" is marked as non-null but was passed a null value.");
      }
      this.owner = owner;
      return this;
    }

    @NonNull
    public Builder setName(@NonNull String name) {
      if (name == null) {
        throw new IllegalArgumentException("Argument \"name\" is marked as non-null but was passed a null value.");
      }
      this.name = name;
      return this;
    }

    @NonNull
    public String getOwner() {
      return owner;
    }

    @NonNull
    public String getName() {
      return name;
    }
  }
}
