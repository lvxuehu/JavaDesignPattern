package com.pattern.lly.iterator;

import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-16
 * Time: 下午1:46
 */
public class Controller implements Iterator {
    private int current=0;
    Vector channel;

    public Controller(Vector channel) {
        this.channel = channel;
    }

    @Override
    public Item fisrt() {
        current=0;
        return (Item)channel.get(current);
    }

    @Override
    public Item next() {
        current++;
        if(current>channel.size()){
            current=0;
        }
        return (Item)channel.get(current);
    }

    @Override
    public Item currentItem() {
        return (Item)channel.get(current);
    }

    @Override
    public boolean isDone() {
        return current>=channel.size()-1;
    }
}
