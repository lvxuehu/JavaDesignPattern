package com.pattern.lly.composite;

/**
 * Created with IntelliJ IDEA.
 *
 * User: liliangyang
 * Date: 13-1-7
 * Time: 下午4:25
 */
public class Client {

    public static void main(String[] args) {
        Leaf l=new Leaf();
        l.sampleOperation();


        Conposite allc=new Conposite();
        Conposite c1=new Conposite();
        c1.add(new Leaf());
        c1.add(new Leaf());

        allc.sampleOperation();


    }
}
