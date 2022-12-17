import product.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.out.println("    Урок Хеш и хеш-функции. Множества");
        System.out.println("Дз1. Задание 1");
        Set<Product> basket = new HashSet<>();
        Banana b1 = new Banana("банан", 89d, 2d);
        Banana b2 = new Banana("банан", 89d, 2d);
        Bread br1 = new Bread("Хлеб", 30d, 1d);
        Milk m1 = new Milk("молоко", 59d, 2d);
        ProductList productList = new ProductList();
        productList.addProduct(b1);
        System.out.println(productList);
        productList.addProduct(br1);
        System.out.println(productList);
        productList.addProduct(m1);
        System.out.println(productList);
        productList.remove(br1);
        System.out.println(productList);

    }


}