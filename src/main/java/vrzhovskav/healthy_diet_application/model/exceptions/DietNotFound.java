package vrzhovskav.healthy_diet_application.model.exceptions;

public class DietNotFound extends RuntimeException{

    public DietNotFound() {
        System.out.println("Diet not found");
    }
}
