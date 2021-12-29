package vrzhovskav.healthy_diet_application.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/recipes")
public class RecipeController {

    @GetMapping
    public String getRecipePage(){
        return "recipes";
    }
}