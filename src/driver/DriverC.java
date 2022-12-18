package driver;

import transport.Truck;

public class DriverC extends Driver<Truck> {
    public enum Category {
        C("C");
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

    public DriverC(String name, boolean haveDriverLicense, int experience, Category category) {
        super(name, haveDriverLicense, experience);
        this.category = category;
    }

    @Override
    public void startDrive(Truck transport) {
        transport.start();
    }

    @Override
    public void stopDrive(Truck transport) {
        transport.stop();
    }

    @Override
    public void refillAuto(Truck transport) {
        System.out.println("Водитель " + getName() + " заправляет грузовик " + transport.getBrand());
    }

    @Override
    public String toString() {
        return super.toString() + ", категория в/у: " + category.typeCategory;
    }
}
