package driver;

import transport.Bus;

public class DriverD extends Driver<Bus> {
    public enum Category {
        D("D");
        private String typeCategory;

        Category(String typeCategory) {
            this.typeCategory = typeCategory;
        }

        public String getTypeCategory() {
            return typeCategory;
        }

        public void setTypeCategory(String typeCategory) {
            this.typeCategory = typeCategory;
        }
    }
    private final Category category;

    public DriverD(String name, boolean haveDriverLicense, int experience,Category category) {
        super(name, haveDriverLicense, experience);
        this.category = category;
    }

    @Override
    public void startDrive(Bus transport) {
        transport.start();
    }

    @Override
    public void stopDrive(Bus transport) {
        transport.stop();
    }

    @Override
    public void refillAuto(Bus transport) {
        System.out.println("Водитель " + getName() + " заправляет автобус " + transport.getBrand());
    }

    @Override
    public String toString() {
        return super.toString() + ", категория в/у: " + category.typeCategory;
    }
}
