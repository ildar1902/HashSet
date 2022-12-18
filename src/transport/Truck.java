package transport;

import driver.DriverC;

public class Truck extends Transport implements Competing {
    public Truck(String brand, String model, double engineVolume, DriverC driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void start() {
        System.out.println("Грузовик \"" + getBrand() + "\" начал движение!");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик \"" + getBrand() + "\" остановился");
    }

    @Override
    public boolean diagnostics() {
        return Math.random() > 0.75;
    }

    @Override
    public void fix() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " починен!");
    }

    @Override
    public void pitStop() {
        System.out.println("Гузовик \"" + getBrand() + "\" заехал на пит-стоп!");
        System.out.println("Гузовик \"" + getBrand() + "\" продолжил движение!");
    }

    @Override
    public int bestLapTime() {
        java.util.Random random = new java.util.Random();
        return random.nextInt(4) + 9;
    }

    @Override
    public int maxSpeed() {
        java.util.Random random = new java.util.Random();
        return random.nextInt(50) + 100;
    }
}
