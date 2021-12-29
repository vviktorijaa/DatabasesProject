package vrzhovskav.healthy_diet_application.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/addCalories")
public class AddCaloriesController {

    @GetMapping
    public String getAddCaloriesPage(){
        return "addCalories";
    }

    @PostMapping
    public String addCalories(@RequestParam Integer consumedKcal, Model model){
        return "redirect:/home";
    }
}
