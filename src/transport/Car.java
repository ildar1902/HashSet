package transport;

import driver.DriverB;

public class Car extends Transport implements Competing {

    public Car(String brand, String model, double engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void start() {
        System.out.println("Автомобиль \"" + getBrand() + "\" начал движение!");

    }

    @Override
    public void stop() {
        System.out.println("Автомобиль \"" + getBrand() + "\" остановился!");
    }

    @Override
    public boolean diagnostics() {
        return Math.random() > 0.6;
    }

    @Override
    public void fix() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " починен!");
    }

    @Override
    public void pitStop() {
        System.out.println("Автомобиль \"" + getBrand() + "\" заехал на пит-стоп!");
        System.out.println("Автомобиль \"" + getBrand() + "\" продолжил движение!");
    }

    @Override
    public int bestLapTime() {
        java.util.Random random = new java.util.Random();
        return random.nextInt(4) + 5;
    }

    @Override
    public int maxSpeed() {
        java.util.Random random = new java.util.Random();
        return random.nextInt(50) + 170;
    }
}

