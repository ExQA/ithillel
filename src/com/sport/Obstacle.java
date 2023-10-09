package com.sport;

public abstract class Obstacle {
    protected int length;

    public Obstacle(int length) {
        this.length = length;
    }

    public abstract void overcome(Participant participant);
}
