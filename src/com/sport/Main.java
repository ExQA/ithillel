package com.sport;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Participant> participants = new ArrayList<>();
        participants.add(new Human("Иван", 5, 3));
        participants.add(new Cat("Кит", 1, 1));
        participants.add(new Robot("Робот", 20, 10));

        ArrayList<Obstacle> obstacles = new ArrayList<>();
        obstacles.add(new RoadObstacle(5));
        obstacles.add(new WallObstacle(3));

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                obstacle.overcome(participant);
            }
        }
    }
}
