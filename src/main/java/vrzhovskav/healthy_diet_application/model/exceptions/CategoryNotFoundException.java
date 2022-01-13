package vrzhovskav.healthy_diet_application.model.exceptions;

public class CategoryNotFoundException extends RuntimeException{

    public CategoryNotFoundException() {
        System.out.println("Category not found");
    }
}
