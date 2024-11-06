package io.codeforall.bootcamp.strategy.implementation.transports;

public class Walk implements Transport {
    @Override
    public void goToBootcamp() {
        System.out.println("Leave home");
        System.out.println("Put the destination on the phone's GPS");
        System.out.println("Walk....");
        System.out.println("Arrive at the bootcamp");
    }
}
