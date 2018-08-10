package com.android.example.github.db;

import android.arch.lifecycle.ComputableLiveData;
import android.arch.lifecycle.LiveData;
import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.InvalidationTracker.Observer;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.util.StringUtil;
import android.database.Cursor;
import android.support.annotation.NonNull;
import com.android.example.github.vo.Contributor;
import com.android.example.github.vo.Repo;
import com.android.example.github.vo.RepoSearchResult;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@SuppressWarnings("unchecked")
public class RepoDao_Impl extends RepoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfRepo;

  private final EntityInsertionAdapter __insertionAdapterOfContributor;

  private final EntityInsertionAdapter __insertionAdapterOfRepo_1;

  private final EntityInsertionAdapter __insertionAdapterOfRepoSearchResult;

  public RepoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRepo = new EntityInsertionAdapter<Repo>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Repo`(`id`,`name`,`fullName`,`description`,`stars`,`owner_login`,`owner_url`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Repo value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getFullName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getFullName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        stmt.bindLong(5, value.getStars());
        final Repo.Owner _tmpOwner = value.getOwner();
        if(_tmpOwner != null) {
          if (_tmpOwner.getLogin() == null) {
            stmt.bindNull(6);
          } else {
            stmt.bindString(6, _tmpOwner.getLogin());
          }
          if (_tmpOwner.getUrl() == null) {
            stmt.bindNull(7);
          } else {
            stmt.bindString(7, _tmpOwner.getUrl());
          }
        } else {
          stmt.bindNull(6);
          stmt.bindNull(7);
        }
      }
    };
    this.__insertionAdapterOfContributor = new EntityInsertionAdapter<Contributor>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Contributor`(`repoName`,`repoOwner`,`login`,`contributions`,`avatarUrl`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Contributor value) {
        if (value.repoName == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.repoName);
        }
        if (value.repoOwner == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.repoOwner);
        }
        if (value.getLogin() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getLogin());
        }
        stmt.bindLong(4, value.getContributions());
        if (value.getAvatarUrl() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getAvatarUrl());
        }
      }
    };
    this.__insertionAdapterOfRepo_1 = new EntityInsertionAdapter<Repo>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `Repo`(`id`,`name`,`fullName`,`description`,`stars`,`owner_login`,`owner_url`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Repo value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getFullName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getFullName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        stmt.bindLong(5, value.getStars());
        final Repo.Owner _tmpOwner = value.getOwner();
        if(_tmpOwner != null) {
          if (_tmpOwner.getLogin() == null) {
            stmt.bindNull(6);
          } else {
            stmt.bindString(6, _tmpOwner.getLogin());
          }
          if (_tmpOwner.getUrl() == null) {
            stmt.bindNull(7);
          } else {
            stmt.bindString(7, _tmpOwner.getUrl());
          }
        } else {
          stmt.bindNull(6);
          stmt.bindNull(7);
        }
      }
    };
    this.__insertionAdapterOfRepoSearchResult = new EntityInsertionAdapter<RepoSearchResult>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `RepoSearchResult`(`query`,`repoIds`,`totalCount`,`next`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RepoSearchResult value) {
        if (value.getQuery() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getQuery());
        }
        final String _tmp;
        _tmp = GithubTypeConverters.intListToString(value.getRepoIds());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
        stmt.bindLong(3, value.getTotalCount());
        if (value.getNext() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getNext());
        }
      }
    };
  }

  @Override
  public void insert(Repo... repos) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfRepo.insert(repos);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertContributors(List<Contributor> contributors) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfContributor.insert(contributors);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertRepos(List<Repo> repositories) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfRepo.insert(repositories);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public long createRepoIfNotExists(Repo repo) {
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfRepo_1.insertAndReturnId(repo);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insert(RepoSearchResult result) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfRepoSearchResult.insert(result);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<Repo> load(String ownerLogin, String name) {
    final String _sql = "SELECT * FROM repo WHERE owner_login = ? AND name = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (ownerLogin == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, ownerLogin);
    }
    _argIndex = 2;
    if (name == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, name);
    }
    return new ComputableLiveData<Repo>() {
      private Observer _observer;

      @Override
      protected Repo compute() {
        if (_observer == null) {
          _observer = new Observer("repo") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
          final int _cursorIndexOfFullName = _cursor.getColumnIndexOrThrow("fullName");
          final int _cursorIndexOfDescription = _cursor.getColumnIndexOrThrow("description");
          final int _cursorIndexOfStars = _cursor.getColumnIndexOrThrow("stars");
          final int _cursorIndexOfLogin = _cursor.getColumnIndexOrThrow("owner_login");
          final int _cursorIndexOfUrl = _cursor.getColumnIndexOrThrow("owner_url");
          final Repo _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpFullName;
            _tmpFullName = _cursor.getString(_cursorIndexOfFullName);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final int _tmpStars;
            _tmpStars = _cursor.getInt(_cursorIndexOfStars);
            final Repo.Owner _tmpOwner;
            if (! (_cursor.isNull(_cursorIndexOfLogin) && _cursor.isNull(_cursorIndexOfUrl))) {
              final String _tmpLogin;
              _tmpLogin = _cursor.getString(_cursorIndexOfLogin);
              final String _tmpUrl;
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
              _tmpOwner = new Repo.Owner(_tmpLogin,_tmpUrl);
            }  else  {
              _tmpOwner = null;
            }
            _result = new Repo(_tmpId,_tmpName,_tmpFullName,_tmpDescription,_tmpOwner,_tmpStars);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }

  @Override
  public LiveData<List<Contributor>> loadContributors(String owner, String name) {
    final String _sql = "\n"
            + "        SELECT login, avatarUrl, repoName, repoOwner, contributions FROM contributor\n"
            + "        WHERE repoName = ? AND repoOwner = ?\n"
            + "        ORDER BY contributions DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (name == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, name);
    }
    _argIndex = 2;
    if (owner == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, owner);
    }
    return new ComputableLiveData<List<Contributor>>() {
      private Observer _observer;

      @Override
      protected List<Contributor> compute() {
        if (_observer == null) {
          _observer = new Observer("contributor") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfLogin = _cursor.getColumnIndexOrThrow("login");
          final int _cursorIndexOfAvatarUrl = _cursor.getColumnIndexOrThrow("avatarUrl");
          final int _cursorIndexOfRepoName = _cursor.getColumnIndexOrThrow("repoName");
          final int _cursorIndexOfRepoOwner = _cursor.getColumnIndexOrThrow("repoOwner");
          final int _cursorIndexOfContributions = _cursor.getColumnIndexOrThrow("contributions");
          final List<Contributor> _result = new ArrayList<Contributor>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Contributor _item;
            final String _tmpLogin;
            _tmpLogin = _cursor.getString(_cursorIndexOfLogin);
            final String _tmpAvatarUrl;
            _tmpAvatarUrl = _cursor.getString(_cursorIndexOfAvatarUrl);
            final int _tmpContributions;
            _tmpContributions = _cursor.getInt(_cursorIndexOfContributions);
            _item = new Contributor(_tmpLogin,_tmpContributions,_tmpAvatarUrl);
            _item.repoName = _cursor.getString(_cursorIndexOfRepoName);
            _item.repoOwner = _cursor.getString(_cursorIndexOfRepoOwner);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }

  @Override
  public LiveData<List<Repo>> loadRepositories(String owner) {
    final String _sql = "\n"
            + "        SELECT * FROM Repo\n"
            + "        WHERE owner_login = ?\n"
            + "        ORDER BY stars DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (owner == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, owner);
    }
    return new ComputableLiveData<List<Repo>>() {
      private Observer _observer;

      @Override
      protected List<Repo> compute() {
        if (_observer == null) {
          _observer = new Observer("Repo") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
          final int _cursorIndexOfFullName = _cursor.getColumnIndexOrThrow("fullName");
          final int _cursorIndexOfDescription = _cursor.getColumnIndexOrThrow("description");
          final int _cursorIndexOfStars = _cursor.getColumnIndexOrThrow("stars");
          final int _cursorIndexOfLogin = _cursor.getColumnIndexOrThrow("owner_login");
          final int _cursorIndexOfUrl = _cursor.getColumnIndexOrThrow("owner_url");
          final List<Repo> _result = new ArrayList<Repo>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Repo _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpFullName;
            _tmpFullName = _cursor.getString(_cursorIndexOfFullName);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final int _tmpStars;
            _tmpStars = _cursor.getInt(_cursorIndexOfStars);
            final Repo.Owner _tmpOwner;
            if (! (_cursor.isNull(_cursorIndexOfLogin) && _cursor.isNull(_cursorIndexOfUrl))) {
              final String _tmpLogin;
              _tmpLogin = _cursor.getString(_cursorIndexOfLogin);
              final String _tmpUrl;
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
              _tmpOwner = new Repo.Owner(_tmpLogin,_tmpUrl);
            }  else  {
              _tmpOwner = null;
            }
            _item = new Repo(_tmpId,_tmpName,_tmpFullName,_tmpDescription,_tmpOwner,_tmpStars);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }

  @Override
  public LiveData<RepoSearchResult> search(String query) {
    final String _sql = "SELECT * FROM RepoSearchResult WHERE `query` = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    return new ComputableLiveData<RepoSearchResult>() {
      private Observer _observer;

      @Override
      protected RepoSearchResult compute() {
        if (_observer == null) {
          _observer = new Observer("RepoSearchResult") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfQuery = _cursor.getColumnIndexOrThrow("query");
          final int _cursorIndexOfRepoIds = _cursor.getColumnIndexOrThrow("repoIds");
          final int _cursorIndexOfTotalCount = _cursor.getColumnIndexOrThrow("totalCount");
          final int _cursorIndexOfNext = _cursor.getColumnIndexOrThrow("next");
          final RepoSearchResult _result;
          if(_cursor.moveToFirst()) {
            final String _tmpQuery;
            _tmpQuery = _cursor.getString(_cursorIndexOfQuery);
            final List<Integer> _tmpRepoIds;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfRepoIds);
            _tmpRepoIds = GithubTypeConverters.stringToIntList(_tmp);
            final int _tmpTotalCount;
            _tmpTotalCount = _cursor.getInt(_cursorIndexOfTotalCount);
            final Integer _tmpNext;
            if (_cursor.isNull(_cursorIndexOfNext)) {
              _tmpNext = null;
            } else {
              _tmpNext = _cursor.getInt(_cursorIndexOfNext);
            }
            _result = new RepoSearchResult(_tmpQuery,_tmpRepoIds,_tmpTotalCount,_tmpNext);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }

  @Override
  protected LiveData<List<Repo>> loadById(List<Integer> repoIds) {
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT * FROM Repo WHERE id in (");
    final int _inputSize = repoIds.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (Integer _item : repoIds) {
      if (_item == null) {
        _statement.bindNull(_argIndex);
      } else {
        _statement.bindLong(_argIndex, _item);
      }
      _argIndex ++;
    }
    return new ComputableLiveData<List<Repo>>() {
      private Observer _observer;

      @Override
      protected List<Repo> compute() {
        if (_observer == null) {
          _observer = new Observer("Repo") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
          final int _cursorIndexOfFullName = _cursor.getColumnIndexOrThrow("fullName");
          final int _cursorIndexOfDescription = _cursor.getColumnIndexOrThrow("description");
          final int _cursorIndexOfStars = _cursor.getColumnIndexOrThrow("stars");
          final int _cursorIndexOfLogin = _cursor.getColumnIndexOrThrow("owner_login");
          final int _cursorIndexOfUrl = _cursor.getColumnIndexOrThrow("owner_url");
          final List<Repo> _result = new ArrayList<Repo>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Repo _item_1;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpFullName;
            _tmpFullName = _cursor.getString(_cursorIndexOfFullName);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final int _tmpStars;
            _tmpStars = _cursor.getInt(_cursorIndexOfStars);
            final Repo.Owner _tmpOwner;
            if (! (_cursor.isNull(_cursorIndexOfLogin) && _cursor.isNull(_cursorIndexOfUrl))) {
              final String _tmpLogin;
              _tmpLogin = _cursor.getString(_cursorIndexOfLogin);
              final String _tmpUrl;
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
              _tmpOwner = new Repo.Owner(_tmpLogin,_tmpUrl);
            }  else  {
              _tmpOwner = null;
            }
            _item_1 = new Repo(_tmpId,_tmpName,_tmpFullName,_tmpDescription,_tmpOwner,_tmpStars);
            _result.add(_item_1);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }

  @Override
  public RepoSearchResult findSearchResult(String query) {
    final String _sql = "SELECT * FROM RepoSearchResult WHERE `query` = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfQuery = _cursor.getColumnIndexOrThrow("query");
      final int _cursorIndexOfRepoIds = _cursor.getColumnIndexOrThrow("repoIds");
      final int _cursorIndexOfTotalCount = _cursor.getColumnIndexOrThrow("totalCount");
      final int _cursorIndexOfNext = _cursor.getColumnIndexOrThrow("next");
      final RepoSearchResult _result;
      if(_cursor.moveToFirst()) {
        final String _tmpQuery;
        _tmpQuery = _cursor.getString(_cursorIndexOfQuery);
        final List<Integer> _tmpRepoIds;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfRepoIds);
        _tmpRepoIds = GithubTypeConverters.stringToIntList(_tmp);
        final int _tmpTotalCount;
        _tmpTotalCount = _cursor.getInt(_cursorIndexOfTotalCount);
        final Integer _tmpNext;
        if (_cursor.isNull(_cursorIndexOfNext)) {
          _tmpNext = null;
        } else {
          _tmpNext = _cursor.getInt(_cursorIndexOfNext);
        }
        _result = new RepoSearchResult(_tmpQuery,_tmpRepoIds,_tmpTotalCount,_tmpNext);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
