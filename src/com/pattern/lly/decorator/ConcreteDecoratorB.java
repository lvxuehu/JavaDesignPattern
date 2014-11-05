package com.pattern.lly.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-10
 * Time: 下午2:17
 */
public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
    }

    private void addedBehavior(){
        System.out.println("add a new operation");
    }
}
