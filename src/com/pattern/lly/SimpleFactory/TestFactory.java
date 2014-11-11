package com.pattern.lly.SimpleFactory;

/**
 * Created by lly on 14/11/11.
 */
public class TestFactory {
    public static void main(String[] args) {
        Car car=SimpleFactory.getCar(1);
        System.out.println("car.carName() = " + car.carName());

        car=SimpleFactory.getCar(2);
        System.out.println("car.carName() = " + car.carName());

    }
}
