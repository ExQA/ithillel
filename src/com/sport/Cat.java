package com.sport;

public class Cat extends Participant {
    public Cat(String name, int distance, int height) {
        super(name, distance, height);
    }

    @Override
    public void move() {
        System.out.println("Участник " + name + " прыгает");
    }
}

