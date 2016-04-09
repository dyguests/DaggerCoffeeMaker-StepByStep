package com.fanhl.coffeemaker;

import android.app.Application;

/**
 * Created by fanhl on 16/4/9.
 */
public class App extends Application {
    AppComponent component;//2.2.1.2.3

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.builder().build();//2.2.1.3.1
    }

    //2.2.1.2.4
    public AppComponent component() {
        return component;
    }
}
