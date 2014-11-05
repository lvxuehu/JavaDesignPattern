package com.pattern.lly.factory;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 12-12-31
 * Time: 下午3:00
 */
public class MainTest {
    public static void main(String[] args) {
        Driver driver=new BenzCarDriver();
        Car car=driver.driver();
        car.drive();
    }
}
