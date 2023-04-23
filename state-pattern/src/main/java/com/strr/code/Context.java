package com.strr.code;

import com.strr.code.state.State;

public class Context {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
