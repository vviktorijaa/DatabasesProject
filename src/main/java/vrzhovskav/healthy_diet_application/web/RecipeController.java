package vrzhovskav.healthy_diet_application.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vrzhovskav.healthy_diet_application.service.RecipeService;

@Controller
@RequestMapping("/recipes")
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping
    public String getRecipePage(@RequestParam (required = false) String searchRecipes,
                                Model model){
        if(searchRecipes!=null && !(searchRecipes.isEmpty())){
            model.addAttribute("allRecipes", recipeService.findAllByName(searchRecipes));
        }
        else{
            model.addAttribute("allRecipes", recipeService.findAll());
        }
        return "recipes";
    }

    @GetMapping("/recipe/{id}")
    public String getRecipeById(){
        return "redirect:/home";
    }

    @PostMapping("/addToFavourites/{id}")
    public String addToFave(){
        return "redirect:/home";
    }
}
