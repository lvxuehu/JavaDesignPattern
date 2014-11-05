package com.pattern.lly.building;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 12-12-31
 * Time: 下午4:22
 */
public class ManBuilder implements PersonBuilder {

    Person person=null;

    public ManBuilder() {
        person=new Man();
    }

    @Override
    public void buildHead() {
         person.setHead("build man head");
    }

    @Override
    public void buildBody() {
        person.setBody("build man body");
    }

    @Override
    public void buildFoot() {
        person.setFoot("build man foot");
    }

    @Override
    public Person buildPerson() {
        return person;

    }
}
