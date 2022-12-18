package product;
import java.util.HashSet;
import java.util.Set;

public class ProductList {

    private final Set<Product> products = new HashSet<>();
    private String name;

    public ProductList(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addProduct(Product product) {
        if (products.contains(product)) {
            throw new IllegalArgumentException("В списке уже есть " + product.getName());
        }
        products.add(product);
        System.out.println("Вы добавили " + product.getName());

    }

    public void remove(Product product) {
        products.remove(product);
        System.out.println("Убрали из списка " + product.getName());
    }

    @Override
    public String toString() {
        return "В " + getName() +  " списке: " + products;
    }
}
