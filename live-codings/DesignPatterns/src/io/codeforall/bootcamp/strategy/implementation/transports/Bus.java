package io.codeforall.bootcamp.strategy.implementation.transports;

public class Bus implements Transport {
    @Override
    public void goToBootcamp() {
        System.out.println("Leave home");
        System.out.println("Walk towards the bus stop");
        System.out.println("Wait for the bus to arrive");
        System.out.println("Enter the bus");
        System.out.println("Pay the fare");
        System.out.println("Leave at the closest bus stop to the bootcamp");
        System.out.println("Walk to the bootcamp");
        System.out.println("Arrive");
    }
}
