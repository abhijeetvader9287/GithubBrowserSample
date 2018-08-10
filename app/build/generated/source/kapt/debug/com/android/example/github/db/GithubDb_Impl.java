package com.android.example.github.db;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Callback;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Configuration;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomOpenHelper;
import android.arch.persistence.room.RoomOpenHelper.Delegate;
import android.arch.persistence.room.util.TableInfo;
import android.arch.persistence.room.util.TableInfo.Column;
import android.arch.persistence.room.util.TableInfo.ForeignKey;
import android.arch.persistence.room.util.TableInfo.Index;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public class GithubDb_Impl extends GithubDb {
  private volatile UserDao _userDao;

  private volatile RepoDao _repoDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(3) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `User` (`login` TEXT NOT NULL, `avatarUrl` TEXT, `name` TEXT, `company` TEXT, `reposUrl` TEXT, `blog` TEXT, PRIMARY KEY(`login`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Repo` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `fullName` TEXT NOT NULL, `description` TEXT, `stars` INTEGER NOT NULL, `owner_login` TEXT NOT NULL, `owner_url` TEXT, PRIMARY KEY(`name`, `owner_login`))");
        _db.execSQL("CREATE  INDEX `index_Repo_id` ON `Repo` (`id`)");
        _db.execSQL("CREATE  INDEX `index_Repo_owner_login` ON `Repo` (`owner_login`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Contributor` (`repoName` TEXT NOT NULL, `repoOwner` TEXT NOT NULL, `login` TEXT NOT NULL, `contributions` INTEGER NOT NULL, `avatarUrl` TEXT, PRIMARY KEY(`repoName`, `repoOwner`, `login`), FOREIGN KEY(`repoName`, `repoOwner`) REFERENCES `Repo`(`name`, `owner_login`) ON UPDATE CASCADE ON DELETE NO ACTION DEFERRABLE INITIALLY DEFERRED)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `RepoSearchResult` (`query` TEXT NOT NULL, `repoIds` TEXT NOT NULL, `totalCount` INTEGER NOT NULL, `next` INTEGER, PRIMARY KEY(`query`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"194bcd4d7aa663957137ba65a0a6a002\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `User`");
        _db.execSQL("DROP TABLE IF EXISTS `Repo`");
        _db.execSQL("DROP TABLE IF EXISTS `Contributor`");
        _db.execSQL("DROP TABLE IF EXISTS `RepoSearchResult`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        _db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsUser = new HashMap<String, TableInfo.Column>(6);
        _columnsUser.put("login", new TableInfo.Column("login", "TEXT", true, 1));
        _columnsUser.put("avatarUrl", new TableInfo.Column("avatarUrl", "TEXT", false, 0));
        _columnsUser.put("name", new TableInfo.Column("name", "TEXT", false, 0));
        _columnsUser.put("company", new TableInfo.Column("company", "TEXT", false, 0));
        _columnsUser.put("reposUrl", new TableInfo.Column("reposUrl", "TEXT", false, 0));
        _columnsUser.put("blog", new TableInfo.Column("blog", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUser = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUser = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUser = new TableInfo("User", _columnsUser, _foreignKeysUser, _indicesUser);
        final TableInfo _existingUser = TableInfo.read(_db, "User");
        if (! _infoUser.equals(_existingUser)) {
          throw new IllegalStateException("Migration didn't properly handle User(com.android.example.github.vo.User).\n"
                  + " Expected:\n" + _infoUser + "\n"
                  + " Found:\n" + _existingUser);
        }
        final HashMap<String, TableInfo.Column> _columnsRepo = new HashMap<String, TableInfo.Column>(7);
        _columnsRepo.put("id", new TableInfo.Column("id", "INTEGER", true, 0));
        _columnsRepo.put("name", new TableInfo.Column("name", "TEXT", true, 1));
        _columnsRepo.put("fullName", new TableInfo.Column("fullName", "TEXT", true, 0));
        _columnsRepo.put("description", new TableInfo.Column("description", "TEXT", false, 0));
        _columnsRepo.put("stars", new TableInfo.Column("stars", "INTEGER", true, 0));
        _columnsRepo.put("owner_login", new TableInfo.Column("owner_login", "TEXT", true, 2));
        _columnsRepo.put("owner_url", new TableInfo.Column("owner_url", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRepo = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRepo = new HashSet<TableInfo.Index>(2);
        _indicesRepo.add(new TableInfo.Index("index_Repo_id", false, Arrays.asList("id")));
        _indicesRepo.add(new TableInfo.Index("index_Repo_owner_login", false, Arrays.asList("owner_login")));
        final TableInfo _infoRepo = new TableInfo("Repo", _columnsRepo, _foreignKeysRepo, _indicesRepo);
        final TableInfo _existingRepo = TableInfo.read(_db, "Repo");
        if (! _infoRepo.equals(_existingRepo)) {
          throw new IllegalStateException("Migration didn't properly handle Repo(com.android.example.github.vo.Repo).\n"
                  + " Expected:\n" + _infoRepo + "\n"
                  + " Found:\n" + _existingRepo);
        }
        final HashMap<String, TableInfo.Column> _columnsContributor = new HashMap<String, TableInfo.Column>(5);
        _columnsContributor.put("repoName", new TableInfo.Column("repoName", "TEXT", true, 1));
        _columnsContributor.put("repoOwner", new TableInfo.Column("repoOwner", "TEXT", true, 2));
        _columnsContributor.put("login", new TableInfo.Column("login", "TEXT", true, 3));
        _columnsContributor.put("contributions", new TableInfo.Column("contributions", "INTEGER", true, 0));
        _columnsContributor.put("avatarUrl", new TableInfo.Column("avatarUrl", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysContributor = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysContributor.add(new TableInfo.ForeignKey("Repo", "NO ACTION", "CASCADE",Arrays.asList("repoName","repoOwner"), Arrays.asList("name","owner_login")));
        final HashSet<TableInfo.Index> _indicesContributor = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoContributor = new TableInfo("Contributor", _columnsContributor, _foreignKeysContributor, _indicesContributor);
        final TableInfo _existingContributor = TableInfo.read(_db, "Contributor");
        if (! _infoContributor.equals(_existingContributor)) {
          throw new IllegalStateException("Migration didn't properly handle Contributor(com.android.example.github.vo.Contributor).\n"
                  + " Expected:\n" + _infoContributor + "\n"
                  + " Found:\n" + _existingContributor);
        }
        final HashMap<String, TableInfo.Column> _columnsRepoSearchResult = new HashMap<String, TableInfo.Column>(4);
        _columnsRepoSearchResult.put("query", new TableInfo.Column("query", "TEXT", true, 1));
        _columnsRepoSearchResult.put("repoIds", new TableInfo.Column("repoIds", "TEXT", true, 0));
        _columnsRepoSearchResult.put("totalCount", new TableInfo.Column("totalCount", "INTEGER", true, 0));
        _columnsRepoSearchResult.put("next", new TableInfo.Column("next", "INTEGER", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRepoSearchResult = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRepoSearchResult = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRepoSearchResult = new TableInfo("RepoSearchResult", _columnsRepoSearchResult, _foreignKeysRepoSearchResult, _indicesRepoSearchResult);
        final TableInfo _existingRepoSearchResult = TableInfo.read(_db, "RepoSearchResult");
        if (! _infoRepoSearchResult.equals(_existingRepoSearchResult)) {
          throw new IllegalStateException("Migration didn't properly handle RepoSearchResult(com.android.example.github.vo.RepoSearchResult).\n"
                  + " Expected:\n" + _infoRepoSearchResult + "\n"
                  + " Found:\n" + _existingRepoSearchResult);
        }
      }
    }, "194bcd4d7aa663957137ba65a0a6a002", "9b805dc82a125f7211623d00d276833b");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "User","Repo","Contributor","RepoSearchResult");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `User`");
      _db.execSQL("DELETE FROM `Repo`");
      _db.execSQL("DELETE FROM `Contributor`");
      _db.execSQL("DELETE FROM `RepoSearchResult`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public UserDao userDao() {
    if (_userDao != null) {
      return _userDao;
    } else {
      synchronized(this) {
        if(_userDao == null) {
          _userDao = new UserDao_Impl(this);
        }
        return _userDao;
      }
    }
  }

  @Override
  public RepoDao repoDao() {
    if (_repoDao != null) {
      return _repoDao;
    } else {
      synchronized(this) {
        if(_repoDao == null) {
          _repoDao = new RepoDao_Impl(this);
        }
        return _repoDao;
      }
    }
  }
}
