package io.codeforall.bootcamp.strategy.implementation.transports;

public class Car implements Transport {
    @Override
    public void goToBootcamp() {
        System.out.println("Leave home");
        System.out.println("Go to the garage");
        System.out.println("Enter the car");
        System.out.println("Start the car");
        System.out.println("Open the garage");
        System.out.println("Put the destination on the phone's GPS");
        System.out.println("Drive...");
        System.out.println("Arrive at destination");
        System.out.println("Park car");
        System.out.println("Walk towards the bootcamp");
        System.out.println("Arrive");
    }
}
