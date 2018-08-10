package com.android.example.github.ui.repo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class RepoFragmentDirections {
  @NonNull
  public static ShowUser showUser(@NonNull String login) {
    return new ShowUser(login);
  }

  public static class ShowUser implements NavDirections {
    @NonNull
    private String login;

    public ShowUser(@NonNull String login) {
      this.login = login;
      if (this.login == null) {
        throw new IllegalArgumentException("Argument \"login\" is marked as non-null but was passed a null value.");
      }
    }

    @NonNull
    public ShowUser setLogin(@NonNull String login) {
      if (login == null) {
        throw new IllegalArgumentException("Argument \"login\" is marked as non-null but was passed a null value.");
      }
      this.login = login;
      return this;
    }

    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      __outBundle.putString("login", this.login);
      return __outBundle;
    }

    public int getActionId() {
      return com.android.example.github.R.id.showUser;
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
      ShowUser that = (ShowUser) object;
      if (login != null ? !login.equals(that.login) : that.login != null) {
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
      result = 31 * result + (login != null ? login.hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }
  }
}
