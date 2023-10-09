package com.sport;

public class Human extends Participant {
    public Human(String name, int distance, int height) {
        super(name, distance, height);
    }

    @Override
    public void move() {
        System.out.println("Участник " + name + " бежит");
    }
}

