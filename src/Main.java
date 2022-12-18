import product.*;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.out.println("    Урок Хеш и хеш-функции. Множества");
        System.out.println("Дз1. Задание 1");
        Banana b1 = new Banana("банан", 89d, 2d);
        Banana b2 = new Banana("банан", 89d, 2d);
        Bread br1 = new Bread("Хлеб", 30d, 1d);
        Milk m1 = new Milk("молоко", 59d, 2d);
        ProductList productList = new ProductList("1");
        System.out.println(productList);
        productList.addProduct(b1);
        System.out.println(productList);
        productList.addProduct(br1);
        System.out.println(productList);
        productList.addProduct(m1);
        System.out.println(productList);
        productList.remove(br1);
        System.out.println(productList);
        System.out.println();
//        ДЗ-2. Задание 1.
        System.out.println("ДЗ-2. Задание 1.");
        System.out.println();
        Recipe recipe1 = new Recipe(productList, 148, "newRecipe");
        ProductList productList2 = new ProductList("2");
        Recipe recipe2 = new Recipe(productList2, 89, "newRecipe2");
        productList2.addProduct(br1);
        productList2.addProduct(m1);
        System.out.println(productList2);
        RecipeList recipeList = new RecipeList();
        recipeList.addRecipe(recipe1);
        System.out.println(recipeList);
    }
}
