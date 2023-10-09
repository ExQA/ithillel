package com.sport;

public class RoadObstacle extends Obstacle {
    public RoadObstacle(int length) {
        super(length);
    }

    @Override
    public void overcome(Participant participant) {
        if (participant.getDistance() >= this.length) {
            System.out.println("Участник " + participant.getName() + " пробежал " + this.getClass().getSimpleName() + " дистанцию " + this.length + "м");
        } else {
            System.out.println("Участник " + participant.getName() + " не смог пробежать " + this.getClass().getSimpleName() + " дистанцию " + this.length + "м");
        }
    }
}
