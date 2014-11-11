package com.pattern.lly.SimpleFactory;

/**
 * Created by lly on 14/11/11.
 */
public class BenzCar implements Car {

    String carName;

    public BenzCar() {
        carName="--Benz--";
    }

    @Override
    public String carName() {
        return carName;
    }
}
