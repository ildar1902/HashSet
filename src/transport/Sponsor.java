package transport;

import java.util.Objects;

public class Sponsor {
    private final String name;
    private double amountOfSupport;

    public Sponsor(String name, double amountOfSupport) {
        this.name = name;
        setAmountOfSupport(amountOfSupport);
    }

    public void sponsored() {
        System.out.println("Спонсор \""+  getName() + "\"" + " спонсирует заезд на сумму " + amountOfSupport);
    }

    public String getName() {
        return name;
    }

    public double getAmountOfSupport() {
        return amountOfSupport;
    }

    public void setAmountOfSupport(double amountOfSupport) {
        if (amountOfSupport <= 0) {
            this.amountOfSupport = 100_000;
        } else {
            this.amountOfSupport = amountOfSupport;
        }
    }

    @Override
    public String toString() {
        return name + ". Сумма поддержки: " + amountOfSupport + " рублей";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return Double.compare(sponsor.amountOfSupport, amountOfSupport) == 0 && Objects.equals(name, sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amountOfSupport);
    }
}
