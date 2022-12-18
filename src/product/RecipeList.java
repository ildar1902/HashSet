package product;

import java.util.HashSet;
import java.util.Set;

public class RecipeList {
    private final Set<Recipe> recipes = new HashSet<>();

    public RecipeList() {
    }

    public void addRecipe(Recipe recipe) {
        if (recipes.contains(recipe)) {
            throw new IllegalArgumentException("В списке уже есть " + recipe.getName());
        }
        recipes.add(recipe);
        System.out.println("Вы добавили " + recipe.getName());

    }

    public void remove(Recipe recipe) {
        recipes.remove(recipe);
        System.out.println("Убрали из списка " + recipe.getName());
    }

    @Override
    public String toString() {
        return   "В списке рецептов: " + recipes;
    }
}
