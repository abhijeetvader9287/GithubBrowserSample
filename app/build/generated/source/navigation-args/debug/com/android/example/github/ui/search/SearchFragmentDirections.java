package com.android.example.github.ui.search;

import android.os.Bundle;
import android.support.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class SearchFragmentDirections {
  @NonNull
  public static ShowRepo showRepo(@NonNull String owner, @NonNull String name) {
    return new ShowRepo(owner, name);
  }

  public static class ShowRepo implements NavDirections {
    @NonNull
    private String owner;

    @NonNull
    private String name;

    public ShowRepo(@NonNull String owner, @NonNull String name) {
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
    public ShowRepo setOwner(@NonNull String owner) {
      if (owner == null) {
        throw new IllegalArgumentException("Argument \"owner\" is marked as non-null but was passed a null value.");
      }
      this.owner = owner;
      return this;
    }

    @NonNull
    public ShowRepo setName(@NonNull String name) {
      if (name == null) {
        throw new IllegalArgumentException("Argument \"name\" is marked as non-null but was passed a null value.");
      }
      this.name = name;
      return this;
    }

    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      __outBundle.putString("owner", this.owner);
      __outBundle.putString("name", this.name);
      return __outBundle;
    }

    public int getActionId() {
      return com.android.example.github.R.id.showRepo;
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
      ShowRepo that = (ShowRepo) object;
      if (owner != null ? !owner.equals(that.owner) : that.owner != null) {
        return false;
      }
      if (name != null ? !name.equals(that.name) : that.name != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = super.hashCode();
      result = 31 * result + (owner != null ? owner.hashCode() : 0);
      result = 31 * result + (name != null ? name.hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }
  }
}
