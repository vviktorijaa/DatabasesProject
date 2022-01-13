package vrzhovskav.healthy_diet_application.model.exceptions;

public class RecipeNotFound extends RuntimeException{

    public RecipeNotFound() {
        System.out.println("Recipe not found");
    }
}
