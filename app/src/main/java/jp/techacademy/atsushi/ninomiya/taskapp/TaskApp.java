package jp.techacademy.atsushi.ninomiya.taskapp;

/**
 * Created by ninomiyaatsushi on 2016/10/04.
 */
import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class TaskApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder(this).build();
        Realm.setDefaultConfiguration(realmConfiguration);
    }
}