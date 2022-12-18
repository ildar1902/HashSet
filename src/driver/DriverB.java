package driver;

import transport.Car;

public class DriverB extends Driver<Car> {
    public enum Category {
        B("B");
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

    private final Category  category;
    public DriverB(String name, boolean haveDriverLicense, int experience, Category category ) {
        super(name, haveDriverLicense, experience);
        this.category = category;
    }

    @Override
    public void startDrive(Car transport) {
        transport.start();
    }

    @Override
    public void stopDrive(Car transport) {
        transport.stop();
    }

    @Override
    public void refillAuto(Car transport) {
        System.out.println("Водитель " + getName() + " заправляет автомобиль " + transport.getBrand());
    }

    @Override
    public String toString() {
        return super.toString() + ", категория в/у: " + category.typeCategory ;
    }
}
