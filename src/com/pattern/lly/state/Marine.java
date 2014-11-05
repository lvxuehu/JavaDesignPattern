package com.pattern.lly.state;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-16
 * Time: 下午5:39
 */
public class Marine {
    private State state=new NormalState();

    public void setMarine(State state) {
        this.state = state;
    }

    public void fire(){
        state.fire();
    }
}
