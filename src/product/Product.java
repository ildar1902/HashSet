package product;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Product {
    private final Set<Product> products = new HashSet<>();
    private String name;
    private Double price;
    private Double volume;

    public Product(String name, Double price, Double volume) {
        setName(name);
        setPrice(price);
        setVolume(volume);
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Вы добавили в список " + product.getName());
    }

    public void checkDuplicate(Product product) {
        if (products.contains(product)) {
            throw new RuntimeException("В списке уже есть " + product.getName() + "!");
        }
    }

    public void remove(Product product) {
        products.remove(product);
        System.out.println("Вы убрали из списка " + product.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (StringUtils.isNullOrEmpty(name)) {
            throw new RuntimeException("Заполните карточку товара полностью");
        } else if(name.matches("[а-яА-я]")) {
            this.name = name;
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

    public Set<Product> getProducts() {
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (products != null ? !products.equals(product.products) : product.products != null) return false;
        if (!name.equals(product.name)) return false;
        if (!price.equals(product.price)) return false;
        return Objects.equals(volume, product.volume);
    }

    @Override
    public int hashCode() {
        int result = products != null ? products.hashCode() : 0;
        result = 31 * result + name.hashCode();
        result = 31 * result + price.hashCode();
        result = 31 * result + (volume != null ? volume.hashCode() : 0);
        return result;
    }
}
