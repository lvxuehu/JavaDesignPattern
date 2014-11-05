package com.pattern.lly.factory;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 12-12-31
 * Time: 下午2:57
 */
public class BenzCarDriver implements Driver {
//this is a test
    @Override
    public Car driver() {
        return new BenzCar();
    }
}
