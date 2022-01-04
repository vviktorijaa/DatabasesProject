package vrzhovskav.healthy_diet_application.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vrzhovskav.healthy_diet_application.model.PrikazhiPodgotovkaNaRecept;
import vrzhovskav.healthy_diet_application.service.PrikazhiPodgotovkaNaReceptService;
import vrzhovskav.healthy_diet_application.service.PrikazhiReceptService;
import vrzhovskav.healthy_diet_application.service.RecipeService;

@Controller
@RequestMapping("/recipes")
public class RecipeController {

    private final RecipeService recipeService;
    private final PrikazhiReceptService prikazhiReceptService;
    private final PrikazhiPodgotovkaNaReceptService prikazhiPodgotovkaNaReceptService;

    public RecipeController(RecipeService recipeService, PrikazhiReceptService prikazhiReceptService, PrikazhiPodgotovkaNaReceptService prikazhiPodgotovkaNaReceptService) {
        this.recipeService = recipeService;
        this.prikazhiReceptService = prikazhiReceptService;
        this.prikazhiPodgotovkaNaReceptService = prikazhiPodgotovkaNaReceptService;
    }

    @GetMapping
    public String getRecipePage(@RequestParam (required = false) String searchRecipes,
                                Model model){
        if(searchRecipes!=null && !(searchRecipes.isEmpty())){
            model.addAttribute("allRecipes", prikazhiReceptService.findAllByName(searchRecipes));
        }
        else{
            model.addAttribute("allRecipes", prikazhiReceptService.findAll());
        }
        return "recipes";
    }

    @GetMapping("/recipe/{id}")
    public String getRecipeById(@PathVariable Integer id,
                                Model model){
        PrikazhiPodgotovkaNaRecept recept = this.prikazhiPodgotovkaNaReceptService.findById(id);
        model.addAttribute("recipeInfo", recept);
        return "/showRecipes";
    }

    @PostMapping("/addToFavourites/{id}")
    public String addToFave(@PathVariable Integer id){
        return "redirect:/myProfile";
    }
}
