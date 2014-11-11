package com.pattern.lly.SimpleFactory;

/**
 * Created by lly on 14/11/11.
 */
public class SimpleFactory {

    /**
     * 这种工厂模式的问题在于增加了新的车，就需要修改这个工厂类
     * 改进方式：通过xml文件配置，利用java的反射机制来通过配置的方式实现工厂
     * @param type
     * @return
     */
    public static Car getCar(int type){
        Car car=null;
        switch (type){
            case 1:car= new BenzCar();break;
            case 2:car= new BWMCar();break;
        }
        return car;
    }
}
