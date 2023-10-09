package com.sport;

public abstract class Participant {
    protected String name;
    protected int distance;
    protected int height;

    public Participant(String name, int distance, int height) {
        this.name = name;
        this.distance = distance;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    public int getHeight() {
        return height;
    }

    public abstract void move();
}
