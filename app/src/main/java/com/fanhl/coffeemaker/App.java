package com.fanhl.coffeemaker;

import android.app.Application;

/**
 * Created by fanhl on 16/4/9.
 */
public class App extends Application {
    AppGraph graph;//3.1.3.1

    @Override
    public void onCreate() {
        super.onCreate();
        graph = AppComponent.Initializer.init(this);//4.2.4.6
    }

    //3.1.3.3
    public AppGraph component() {
        return graph;
    }
}
