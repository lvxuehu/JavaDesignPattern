package com.pattern.lly.composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-7
 * Time: 下午4:20
 */
public class Conposite implements Component {
    private Vector componentVector=new Vector();

    @Override
    public void sampleOperation() {
        System.out.printf("composite");
    }

    public void add(Component component){
        componentVector.add(component);
    }

    public void remove(Component component){
        componentVector.remove(component);
    }

    public Enumeration components(){
        System.out.printf("******************"+componentVector.size());
        return componentVector.elements();
    }
}
