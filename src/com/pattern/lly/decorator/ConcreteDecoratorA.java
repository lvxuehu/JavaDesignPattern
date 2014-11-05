package com.pattern.lly.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-10
 * Time: 下午2:13
 */
public class ConcreteDecoratorA extends Decorator {
    private String addedState;

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedState="add state";
        System.out.println(addedState);
    }
}
