package vrzhovskav.healthy_diet_application.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vrzhovskav.healthy_diet_application.model.Category;
import vrzhovskav.healthy_diet_application.model.Recipe;
import vrzhovskav.healthy_diet_application.model.User;
import vrzhovskav.healthy_diet_application.service.CategoryService;
import vrzhovskav.healthy_diet_application.service.PrikazhiReceptService;
import vrzhovskav.healthy_diet_application.service.RecipeService;
import vrzhovskav.healthy_diet_application.service.UserService;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/recipes")
public class RecipeController {

    private final RecipeService recipeService;
    private final PrikazhiReceptService prikazhiReceptService;
    private final UserService userService;
    private final CategoryService categoryService;

    public RecipeController(RecipeService recipeService, PrikazhiReceptService prikazhiReceptService, UserService userService, CategoryService categoryService) {
        this.recipeService = recipeService;
        this.prikazhiReceptService = prikazhiReceptService;
        this.userService = userService;
        this.categoryService = categoryService;
    }

    @GetMapping
    public String getRecipePage(@RequestParam (required = false) String searchRecipes,
                                Model model){
        if(searchRecipes!=null && !(searchRecipes.isEmpty())){
            model.addAttribute("allRecipes", this.prikazhiReceptService.findAllByName(searchRecipes));
        }
        else{
            model.addAttribute("allRecipes", this.prikazhiReceptService.findAll());
        }
        model.addAttribute("categories", this.categoryService.findAll());
        return "recipes";
    }

    @GetMapping("/recipe/{id}")
    public String getRecipeById(@PathVariable Integer id,
                                Model model){
        Recipe r = this.recipeService.findById(id);
        model.addAttribute("recipe", r);
        return "/showRecipes";
    }

    @PostMapping("/addToFavourites/{id}")
    public String addToFave(@PathVariable Integer id,
                            HttpServletRequest request){
        User u = (User) request.getSession().getAttribute("u");
        User user = this.userService.findByUsername(u.getUsername());

        Recipe r = this.recipeService.findById(id);

        this.userService.updateFaveRecipe(user.getUsername_id(), r);

        request.getSession().setAttribute("u", user);
        return "redirect:/myProfile";
    }
}
