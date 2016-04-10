package com.fanhl.coffeemaker.machine;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by fanhl on 16/4/9.
 */
@Module//2.2.3.1.1
public class MachineModule {

    //4.1.4.1
    @Singleton
    @Provides
    Pump providePump() {
        return new Thermosiphon();
    }

    @Singleton//2.2.3.2.2
    @Provides//2.2.3.2.1
    CoffeeMaker provideCoffeeMaker(Pump pump) {
        return new CoffeeMaker(pump);//4.1.3.1
    }
}
