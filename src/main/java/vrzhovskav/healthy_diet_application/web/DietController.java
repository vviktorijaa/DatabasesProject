package vrzhovskav.healthy_diet_application.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vrzhovskav.healthy_diet_application.service.DietService;

@Controller
@RequestMapping("/diets")
public class DietController {

    private final DietService dietService;

    public DietController(DietService dietService) {
        this.dietService = dietService;
    }

    @GetMapping
    public String getDietsPage(Model model){
        model.addAttribute("allDiets", dietService.findAll());
        return "diets";
    }

    @GetMapping("/diet/{id}")
    public String getRecipeById(@PathVariable Integer id,
                                Model model){
        return "/showDiets";
    }

    @PostMapping("/addToFavourites/{id}")
    public String addToFave(@PathVariable Integer id){
        return "redirect:/myProfile";
    }
}
