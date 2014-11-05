package com.pattern.lly.building;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 12-12-31
 * Time: 下午4:26
 */
public class PersonDirector {
     public Person constructPerson(PersonBuilder pb){
         pb.buildHead();
         pb.buildBody();
         pb.buildFoot();
         return pb.buildPerson();
     }
}
