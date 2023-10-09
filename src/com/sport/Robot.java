package com.sport;

public class Robot extends Participant {
    public Robot(String name, int distance, int height) {
        super(name, distance, height);
    }

    @Override
    public void move() {
        System.out.println("Участник " + name + " бегает");
    }
}

