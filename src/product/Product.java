package product;

import java.util.Objects;

public class Product {
    private String name;
    private Double price;
    private Double volume;

    public Product(String name, Double price, Double volume) {
        setName(name);
        setPrice(price);
        setVolume(volume);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (StringUtils.isNotEmpty(name) && name.matches("[а-яА-Я]+")) {
            this.name = name;
        } else {
            throw new RuntimeException("Заполните карточку товара полностью!");
        }
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (price == null) {
            throw new RuntimeException("Заполните карточку товара полностью");
        } else {
            this.price = price;
        }
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        if (volume == null) {
            throw new RuntimeException("Заполните карточку товара полностью");
        } else {
            this.volume = volume;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return getName() + " по цене " + getPrice() + " рублей" ;
    }
}
