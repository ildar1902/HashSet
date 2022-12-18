package driver;

import transport.Transport;

public abstract class Driver<T extends Transport> {
    private final String name;
    private boolean haveDriverLicense;
    private int experience;

    public Driver(String name, boolean haveDriverLicense, int experience) {
        if (StringUtils.isNotEmpty(name)) {
            this.name = name;
        } else {
            this.name = "Ivan";
        }
        this.haveDriverLicense = haveDriverLicense;
        if (experience > 0) {
            this.experience = experience;
        } else {
            this.experience = Math.abs(experience);
        }
    }

    public abstract void startDrive(T transport);

    public abstract void stopDrive(T transport);

    public abstract void refillAuto(T transport);

    public void printInfo(T transport) {
        System.out.println("водитель " + getName() + " управляет "
                + transport.getBrand() + " и будет участвовать в заезде!");
    }
    public String getName() {
        return name;
    }

    public boolean isHaveDriverLicense() {
        return haveDriverLicense;
    }

    public void setHaveDriverLicense(boolean haveDriverLicense) {
        this.haveDriverLicense = haveDriverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return name + ", водительский стаж " + experience + " лет";
    }
}
