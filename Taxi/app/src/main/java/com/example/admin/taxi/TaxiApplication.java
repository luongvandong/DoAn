package com.example.admin.taxi;

import android.app.Application;

/**
 * Created by admin on 10/3/2017.
 */

public class TaxiApplication extends Application {
    private static TaxiApplication application;

    public static TaxiApplication getInstance() {
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
    }
}