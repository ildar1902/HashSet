import product.*;

import java.util.HashSet;
import java.util.Random;
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
        recipeList.addRecipe(recipe2);
        System.out.println(recipeList);
        System.out.println();
//        ДЗ-2. Задание 2.
        System.out.println("ДЗ-2. Задание 2.");
        System.out.println();
        Random random = new Random();
        Set<Integer> numbers = new HashSet<>();
        while (numbers.size() < 20) {
            numbers.add(random.nextInt(1000));
        }
        System.out.println("Было: " + numbers);
        numbers.removeIf(number -> number % 2 == 1); //неплохо было бы если б нам подробнее рассказали про эту
        //  функцию или про альтернативные варианты, как из эелементов множества удалить необходимые значения
        // потому что в видео уроках и в шпаргалке не дали нам инструмент для решения этой части задачи
        // максимум, что в шпаргалке про это написано - это то, что нельзя использовать foreach,
        // а что делать вместо этого - ни слова. поэтому самостоятельно, без видео-разбора, нам выполнить эту
//        задачу нереально, я пытался.
        System.out.println("Стало: " + numbers);
    }
}
