package com.pattern.lly.iterator;

import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-16
 * Time: 下午1:55
 */
public class HaierTV implements Television {
    private Vector channel;

    public HaierTV() {
        channel=new Vector();
        channel.addElement(new Item("change1"));
        channel.addElement(new Item("change2"));
        channel.addElement(new Item("change3"));
        channel.addElement(new Item("change4"));
        channel.addElement(new Item("change5"));
        channel.addElement(new Item("change6"));
    }

    @Override
    public Iterator createIterator() {
        return new Controller(channel);
    }

    @Override
    public Vector getChannel() {
        return channel;
    }
}
