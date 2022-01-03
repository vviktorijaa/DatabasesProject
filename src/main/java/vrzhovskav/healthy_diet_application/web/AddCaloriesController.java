package vrzhovskav.healthy_diet_application.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vrzhovskav.healthy_diet_application.service.UserService;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/addCalories")
public class AddCaloriesController {

    private final UserService userService;

    public AddCaloriesController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getAddCaloriesPage(){
        return "addCalories";
    }

    @PostMapping
    public String addCalories(@RequestParam Integer consumedKcal, Model model, HttpServletRequest request){
        return "redirect:/home";
    }
}