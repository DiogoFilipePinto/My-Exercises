package io.codeforall.bootcamp.factory.implementation;

public class Car {

    private int speed;
    private Position position;

    public Car(int speed, Position position) {
        this.speed = speed;
        this.position = position;
    }

    public int getSpeed() {
        return speed;
    }

    public Position getPosition() {
        return position;
    }

    public void move() {
        System.out.println(this.getClass().getSimpleName() + " is going VRROOOM VROOOM");
    }

}
