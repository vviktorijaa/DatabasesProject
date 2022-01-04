package vrzhovskav.healthy_diet_application.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShowRecipesController {

    @GetMapping
    public String showRecipe(){
        return "/showRecipes";
    }
}
