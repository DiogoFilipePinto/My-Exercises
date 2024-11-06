package io.codeforall.bootcamp.builder.implementation;


public class House {

    private final int numberOfDoors;
    private final int rooms;
    private final int windows;
    private final HouseType houseType;
    private final boolean hasGarage;
    private final boolean hasSwimmingPool;
    private final boolean hasFountain;

    private House(Builder builder) {
        this.numberOfDoors = builder.numberOfDoors;
        this.rooms = builder.rooms;
        this.windows = builder.windows;
        this.houseType = builder.houseType;
        this.hasGarage = builder.hasGarage;
        this.hasSwimmingPool = builder.hasSwimmingPool;
        this.hasFountain = builder.hasFountain;
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

    @Override
    public String toString() {
        return "House{" +
                "numberOfDoors=" + numberOfDoors +
                ", rooms=" + rooms +
                ", windows=" + windows +
                ", houseName=" + houseType +
                ", hasGarage=" + hasGarage +
                ", hasSwimmingPool=" + hasSwimmingPool +
                ", hasFountain=" + hasFountain +
                '}';
    }

    public static class Builder {

        private final int numberOfDoors;
        private final int rooms;
        private final int windows;
        private HouseType houseType;
        private boolean hasGarage;
        private boolean hasSwimmingPool;
        private boolean hasFountain;

        public Builder(int numberOfDoors, int rooms, int windows) {
            this.numberOfDoors = numberOfDoors;
            this.rooms = rooms;
            this.windows = windows;
        }

        public House build() {
            return new House(this);
        }

        public Builder houseType(HouseType houseType) {
            this.houseType = houseType;
            return this;
        }

        public Builder hasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public Builder hasSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public Builder hasFountain(boolean hasFountain) {
            this.hasFountain = hasFountain;
            return this;
        }
    }
}
