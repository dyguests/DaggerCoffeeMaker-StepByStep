package com.fanhl.coffeemaker;

import android.content.Context;

import com.fanhl.coffeemaker.machine.MachineModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by fanhl on 16/4/9.
 */
@Singleton//2.2.1.2.2
@Component(modules = {MachineModule.class})//2.2.3.4.1
public interface AppComponent extends AppGraph {
    //3.1.1.2
    final class Initializer {
        private Initializer() {
        }

        public static AppComponent init(Context context) {
            return DaggerAppComponent.builder()
                    .machineModule(new MachineModule(context))//4.2.4.5
                    .build();
        }
    }
}
