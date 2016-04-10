package com.fanhl.coffeemaker.machine;

/**
 * Created by fanhl on 16/4/9.
 */
public class CoffeeMaker {

    private final Heater heater;//4.2.2.1
    private final Pump   pump;//4.1.2.1

    public CoffeeMaker(Heater heater, Pump pump) {
        this.heater = heater;//4.2.2.2
        this.pump = pump;//4.1.2.2
    }

    public String brew() {
        StringBuilder sb = new StringBuilder();
        sb.append(heater.on());//4.2.2.3
        sb.append(pump.pump());//4.1.2.3
        sb.append("[_]P coffee! [_]P\n");
        sb.append(heater.off());//4.2.2.4
        return sb.toString();
    }
}
