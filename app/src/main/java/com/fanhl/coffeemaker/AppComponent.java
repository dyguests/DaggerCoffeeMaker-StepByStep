package com.fanhl.coffeemaker;

import com.fanhl.coffeemaker.ui.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by fanhl on 16/4/9.
 */
@Singleton//2.2.1.2.2
@Component//2.2.1.2.1
public interface AppComponent {
    void inject(MainActivity activity);//2.2.2.1.1
}
