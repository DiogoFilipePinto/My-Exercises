package io.codeforall.bootcamp.factory.implementation;

public class CarFactory {

    public static Car createCarWithSpeedAndPosition(CarType carType, int speed, Position position) {

        return createCar(carType, speed, position);
    }

    private static Car createCar(CarType carType, int speed, Position position) {

        Car car = null;

        switch (carType) {
            case MUSTANG:
                car = new Mustang(speed, position);
                break;
            case FIAT:
                car = new Fiat(speed, position);
                break;
            case VOLKSWAGEN:
                car = new Volkswagen(speed, position);
                break;
            default:
                car = new Volkswagen(speed, position);
        }

        return car;
    }

    public static Car createCarWithPositionAndSpeed(CarType carType, Position position, int speed) {

        return createCar(carType, speed, position);

    }

}
