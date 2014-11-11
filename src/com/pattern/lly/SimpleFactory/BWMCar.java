package com.pattern.lly.SimpleFactory;

/**
 * Created by lly on 14/11/11.
 */
public class BWMCar implements Car{

    String carName;

    public BWMCar() {
        this.carName = "--BWMCar--";
    }

    @Override
    public String carName() {
        return carName;
    }
}
