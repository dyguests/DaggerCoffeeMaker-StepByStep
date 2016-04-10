package com.fanhl.coffeemaker.machine;

/**
 * Created by fanhl on 16/4/10.
 */
public class Thermosiphon implements Pump {
    @Override
    public String pump() {
        return "* *  pump * * pump * *\n";
    }
}
