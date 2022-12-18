package product;

import java.util.Objects;

public class Recipe {
    private ProductList productList;
    private double count;
    private String name;

    public Recipe(ProductList productList, double count, String name) {
        this.productList = productList;
        this.count = count;
        this.name = name;
    }

    public ProductList getProductList() {
        return productList;
    }

    public void setProductList(ProductList productList) {
        this.productList = productList;
    }

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return getName() + ", который содержит " + productList +
                ", общая стоимость продуктов в рецепте: " + count + " рублей";
    }
}
