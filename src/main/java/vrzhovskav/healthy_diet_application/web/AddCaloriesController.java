package vrzhovskav.healthy_diet_application.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import vrzhovskav.healthy_diet_application.model.User;
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
    public String addCalories(@RequestParam Integer consumedKcal, HttpServletRequest request){
        User u = (User) request.getSession().getAttribute("u");
        Integer kcal = consumedKcal + u.getKcal_consumed();
        //u = this.userService.save(u.getUsername(), u.getPassword(), u.getAge(), u.getGender(), u.getHeight(), u.getWeight(), u.getGoal(), u.getActivity_rate(), u.getKcal_needed(), u.getBmi(), kcal, u.getWater_consumed());
        u = this.userService.save(u.getUsername(), u.getPassword(), u.getAge(), u.getGender(), u.getHeight(), u.getWeight(), u.getGoal(), u.getActivity_rate(), u.getKcal_needed(), u.getBmi(), kcal, u.getWater_consumed(), u.getIs_favourite(), u.getUserIsOnADiet());
        request.getSession().setAttribute("u", u);
        return "redirect:/home";
    }
}