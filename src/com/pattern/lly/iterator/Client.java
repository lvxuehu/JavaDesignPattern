package com.pattern.lly.iterator;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-16
 * Time: 下午1:57
 */
public class Client {
    public static void main(String[] args) {
        Television tv = new HaierTV();
        Iterator it = tv.createIterator();
        System.out.println("it.fisrt().getName() = " + it.fisrt().getName());
        while (!it.isDone()) {
            System.out.println("it.next().getName() = " + it.next().getName());
        }
    }
}
