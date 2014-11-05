package com.pattern.lly.building;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 12-12-31
 * Time: 下午4:28
 */
public class Test {
    public static void main(String[] args) {
        PersonDirector pd=new PersonDirector();
        Person person=pd.constructPerson(new ManBuilder());
        System.out.println(person.getHead());
        System.out.println(person.getBody());
        System.out.println(person.getFoot());
    }
}
