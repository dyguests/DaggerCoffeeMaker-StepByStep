package com.fanhl.coffeemaker.machine;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by fanhl on 16/4/9.
 */
@Module//2.2.3.1.1
public class MachineModule {
    @Singleton//2.2.3.2.2
    @Provides//2.2.3.2.1
    CoffeeMaker provideCoffeeMaker() {
        return new CoffeeMaker();
    }
}
