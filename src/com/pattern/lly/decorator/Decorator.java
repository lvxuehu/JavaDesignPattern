package com.pattern.lly.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-10
 * Time: 下午2:11
 */
public class Decorator implements Component {
    private Component component=null;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if (component!=null){
            component.operation();
        }
    }
}
