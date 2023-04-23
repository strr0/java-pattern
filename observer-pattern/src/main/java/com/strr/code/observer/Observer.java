package com.strr.code.observer;

import com.strr.code.Subject;

public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
