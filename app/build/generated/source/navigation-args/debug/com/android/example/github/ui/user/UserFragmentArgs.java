package com.android.example.github.ui.user;

import android.os.Bundle;
import android.support.annotation.NonNull;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class UserFragmentArgs {
  @NonNull
  private String login;

  private UserFragmentArgs() {
  }

  @NonNull
  public static UserFragmentArgs fromBundle(Bundle bundle) {
    UserFragmentArgs result = new UserFragmentArgs();
    bundle.setClassLoader(UserFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("login")) {
      result.login = bundle.getString("login");
      if (result.login == null) {
        throw new IllegalArgumentException("Argument \"login\" is marked as non-null but was passed a null value.");
      }
    } else {
      throw new IllegalArgumentException("Required argument \"login\" is missing and does not have an android:defaultValue");
    }
    return result;
  }

  @NonNull
  public String getLogin() {
    return login;
  }

  @NonNull
  public Bundle toBundle() {
    Bundle __outBundle = new Bundle();
    __outBundle.putString("login", this.login);
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
    UserFragmentArgs that = (UserFragmentArgs) object;
    if (login != null ? !login.equals(that.login) : that.login != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (login != null ? login.hashCode() : 0);
    return result;
  }

  public static class Builder {
    @NonNull
    private String login;

    public Builder(UserFragmentArgs original) {
      this.login = original.login;
    }

    public Builder(@NonNull String login) {
      this.login = login;
      if (this.login == null) {
        throw new IllegalArgumentException("Argument \"login\" is marked as non-null but was passed a null value.");
      }
    }

    @NonNull
    public UserFragmentArgs build() {
      UserFragmentArgs result = new UserFragmentArgs();
      result.login = this.login;
      return result;
    }

    @NonNull
    public Builder setLogin(@NonNull String login) {
      if (login == null) {
        throw new IllegalArgumentException("Argument \"login\" is marked as non-null but was passed a null value.");
      }
      this.login = login;
      return this;
    }

    @NonNull
    public String getLogin() {
      return login;
    }
  }
}
