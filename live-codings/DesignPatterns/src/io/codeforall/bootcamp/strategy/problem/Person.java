package io.codeforall.bootcamp.strategy.problem;

public class Person {

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public void goToBootcamp(String transport) {
        switch (transport) {
            case "bicycle":
                goByBicycle();
                break;
            case "car":
                goByCar();
                break;
            case "bus":
                goByBus();
                break;
            default:
                goByWalking();
                break;
        }
    }

    private void goByWalking() {
        System.out.println("Leave home");
        System.out.println("Put the destination on the phone's GPS");
        System.out.println("Walk....");
        System.out.println("Arrive at the bootcamp");
    }

    private void goByBus() {
        System.out.println("Leave home");
        System.out.println("Walk towards the bus stop");
        System.out.println("Wait for the bus to arrive");
        System.out.println("Enter the bus");
        System.out.println("Pay the fare");
        System.out.println("Leave at the closest bus stop to the bootcamp");
        System.out.println("Walk to the bootcamp");
        System.out.println("Arrive");
    }

    private void goByCar() {
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

    private void goByBicycle() {
        System.out.println("Leave home");
        System.out.println("Go to the garage");
        System.out.println("Grab the bicycle");
        System.out.println("Leave the garage");
        System.out.println("Go towards the bootcamp");
        System.out.println("Arrive at the bootcamp");
        System.out.println("Park the bike");
        System.out.println("Arrive");
    }

    public String getName() {
        return name;
    }
}
