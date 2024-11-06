package io.codeforall.bootcamp.builder.problem;

import io.codeforall.bootcamp.builder.implementation.HouseType;

public class House {

    private final int numberOfDoors;
    private final int rooms;
    private final int windows;
    private final HouseType houseType;
    private final boolean hasGarage;
    private final boolean hasSwimmingPool;
    private final boolean hasFountain;

    // only numberOfDoors, rooms and windows is mandatory
    public House(int numberOfDoors, int rooms, int windows, HouseType houseType, boolean hasGarage, boolean hasSwimmingPool, boolean hasFountain) {
        this.numberOfDoors = numberOfDoors;
        this.rooms = rooms;
        this.windows = windows;
        this.houseType = houseType;
        this.hasGarage = hasGarage;
        this.hasSwimmingPool = hasSwimmingPool;
        this.hasFountain = hasFountain;
    }


    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getRooms() {
        return rooms;
    }

    public int getWindows() {
        return windows;
    }

    public HouseType getHouseType() {
        return houseType;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public boolean isHasSwimmingPool() {
        return hasSwimmingPool;
    }

    public boolean isHasFountain() {
        return hasFountain;
    }
}

