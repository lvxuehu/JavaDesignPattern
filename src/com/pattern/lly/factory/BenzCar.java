package com.pattern.lly.factory;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 12-12-31
 * Time: 下午2:58
 */
public class BenzCar implements Car {
    @Override
    public void drive() {
        System.out.println(" =======Drive Benz Car========");
    }
}
