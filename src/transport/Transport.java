package transport;


import driver.Driver;

import java.util.*;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final double engineVolume;
    private final Driver<?> driver;
    private final Set<Mechanic<?>> mechanics = new HashSet<>();
    private final Set<Sponsor> sponsors = new HashSet<>();


    public Transport(String brand, String model, double engineVolume, Driver<?> driver) {
        if (StringUtils.isNotEmpty(brand)) {
            this.brand = brand;
        } else {
            this.brand = "Укажите марку";
        }
        if (StringUtils.isNotEmpty(model)) {
            this.model = model;
        } else {
            this.model = "Укажите модель";
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        this.driver = driver;
    }

    public Driver<?> getDriver() {
        return driver;
    }

    public Set<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public void addMechanic(Mechanic<?> mechanic) {
        mechanics.add(mechanic);
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    public void addSponsor(Sponsor sponsor) {
        sponsors.add(sponsor);
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public abstract void start();

    public abstract void stop();

    public abstract boolean diagnostics();


    @Override
    public String toString() {
        return "\"" + brand + "\" \"" +
                model + "\"" +
                ", объём двигателя: " + getEngineVolume();
    }
    public abstract void fix();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(driver, transport.driver) && Objects.equals(mechanics, transport.mechanics) && Objects.equals(sponsors, transport.sponsors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, driver, mechanics, sponsors);
    }
}
