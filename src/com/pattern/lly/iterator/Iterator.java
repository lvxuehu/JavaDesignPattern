package com.pattern.lly.iterator;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-16
 * Time: 下午1:45
 */
public interface Iterator {
    public Item fisrt();
    public Item next();
    public Item currentItem();
    public boolean isDone();
}
