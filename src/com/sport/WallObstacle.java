package com.sport;

public class WallObstacle extends Obstacle {
    public WallObstacle(int height) {
        super(height);
    }

    @Override
    public void overcome(Participant participant) {
        if (participant.getHeight() >= this.length) {
            System.out.println("Участник " + participant.getName() + " смог перепрыгнуть " + this.getClass().getSimpleName() + " высоту " + this.length + "м");
        } else {
            System.out.println("Участник " + participant.getName() + " не перепрыгнул " + this.getClass().getSimpleName() + " высоту " + this.length + "м");
        }
    }
}
