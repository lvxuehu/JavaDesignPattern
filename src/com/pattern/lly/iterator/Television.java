package com.pattern.lly.iterator;

import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-16
 * Time: 下午1:54
 */
public interface Television {
    public Iterator createIterator();
    public Vector getChannel();
}
