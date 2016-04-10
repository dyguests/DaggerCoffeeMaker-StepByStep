package com.fanhl.coffeemaker.machine;

import android.content.Context;

import com.fanhl.coffeemaker.R;

/**
 * Created by fanhl on 16/4/10.
 */
public class Heater {
    private final Context context;

    public Heater(Context context) {
        this.context = context;
    }

    public String on() {
        return context.getResources().getString(R.string.heater_on);
    }

    public String off() {
        return context.getResources().getString(R.string.heater_off);
    }
}
