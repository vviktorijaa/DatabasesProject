package vrzhovskav.healthy_diet_application.model.exceptions;

public class UserNotFound extends RuntimeException{

    public UserNotFound() {
        System.out.println("User not found");
    }
}
