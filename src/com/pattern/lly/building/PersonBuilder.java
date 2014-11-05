package com.pattern.lly.building;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 12-12-31
 * Time: 下午4:21
 */
public interface PersonBuilder {
    void buildHead();
    void buildBody();
    void buildFoot();

    Person buildPerson();
}
