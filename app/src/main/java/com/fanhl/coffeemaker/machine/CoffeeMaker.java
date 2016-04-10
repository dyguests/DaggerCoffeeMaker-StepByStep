package com.fanhl.coffeemaker.machine;

/**
 * Created by fanhl on 16/4/9.
 */
public class CoffeeMaker {

    private final Pump pump;//4.1.2.1

    public CoffeeMaker(Pump pump) {
        this.pump = pump;//4.1.2.2
    }

    public String brew() {
        StringBuilder sb = new StringBuilder();
        sb.append(pump.pump());//4.1.2.3
        sb.append("[_]P coffee! [_]P\n");
        return sb.toString();
    }
}
