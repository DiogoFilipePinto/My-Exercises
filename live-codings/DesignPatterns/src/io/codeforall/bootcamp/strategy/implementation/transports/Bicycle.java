package io.codeforall.bootcamp.strategy.implementation.transports;

public class Bicycle implements Transport {
    @Override
    public void goToBootcamp() {
        System.out.println("Leave home");
        System.out.println("Go to the garage");
        System.out.println("Grab the bicycle");
        System.out.println("Leave the garage");
        System.out.println("Go towards the bootcamp");
        System.out.println("Arrive at the bootcamp");
        System.out.println("Park the bike");
        System.out.println("Arrive");
    }
}
