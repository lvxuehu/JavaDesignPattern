package com.pattern.lly.watch;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-16
 * Time: 下午3:35
 */
public class Client {
    public static void main(String[] args) {
        AbstractWatched abstractWatched=new ConcreteWatched();

        AbstractWatcher abstractWatcher1=new ConcreteWatcher();
        AbstractWatcher abstractWatcher2=new ConcreteWatcher();
        AbstractWatcher abstractWatcher3=new ConcreteWatcher();

        abstractWatched.addWatcher(abstractWatcher1);
        abstractWatched.addWatcher(abstractWatcher2);
        abstractWatched.addWatcher(abstractWatcher3);

        System.out.println("notify first......");
        abstractWatched.notifyWatchers();

        abstractWatched.removeWatcher(abstractWatcher1);
        System.out.println("notify second......");
        abstractWatched.notifyWatchers();


        abstractWatched.removeAllWatcher();
        System.out.println("remove all obj and notify third......");
        abstractWatched.notifyWatchers();
    }
}
