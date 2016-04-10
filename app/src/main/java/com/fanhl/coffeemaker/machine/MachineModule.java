package com.fanhl.coffeemaker.machine;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by fanhl on 16/4/9.
 */
@Module//2.2.3.1.1
public class MachineModule {

    private final Context context;//4.2.4.3

    //4.2.4.4
    public MachineModule(Context context) {
        this.context = context;
    }

    //4.2.4.2
    @Singleton
    @Provides
    Context provideContext() {
        return context;
    }

    //4.2.3.1
    @Singleton
    @Provides
    Heater provideHeater(Context context) {
        return new Heater(context);//4.2.4.1
    }

    //4.1.4.1
    @Singleton
    @Provides
    Pump providePump() {
        return new Thermosiphon();
    }

    @Singleton//2.2.3.2.2
    @Provides
    CoffeeMaker provideCoffeeMaker(Heater heater, Pump pump) {
        return new CoffeeMaker(heater, pump);//4.1.3.1
    }
}
