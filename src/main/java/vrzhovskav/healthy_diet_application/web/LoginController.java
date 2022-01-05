package vrzhovskav.healthy_diet_application.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vrzhovskav.healthy_diet_application.model.User;
import vrzhovskav.healthy_diet_application.service.UserService;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/login")
public class LoginController {

    private final UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getLoginPage(){
        return "login";
    }

    @PostMapping
    public String getHomePage(@RequestParam String username,
                              @RequestParam String password,
                              @RequestParam Integer age,
                              @RequestParam String gender,
                              @RequestParam Float height,
                              @RequestParam Float weight,
                              @RequestParam String goal,
                              @RequestParam String physicallyActive,
                              Model model,
                              HttpServletRequest request){
        Float bmi = userService.calculateBMI(height, weight);
        Integer maxKcal = userService.maxCalories(age, gender, height, weight, physicallyActive, goal);
        model.addAttribute("bmi", bmi);
        model.addAttribute("maxKcal", maxKcal);
        User u = new User(username, password, age, gender, height, weight, goal, physicallyActive, maxKcal, bmi, 0, 0);
//        model.addAttribute("user", userService.save(u.getUsername(), u.getPassword(),
//                u.getAge(), u.getGender(), u.getHeight(), u.getWeight(),
//                u.getGoal(), u.getActivity_rate(), u.getKcal_needed(), u.getBmi(), 0, 0));
        model.addAttribute("user", userService.save(u.getUsername(), u.getPassword(),
                u.getAge(), u.getGender(), u.getHeight(), u.getWeight(),
                u.getGoal(), u.getActivity_rate(), u.getKcal_needed(), u.getBmi(), u.getKcal_consumed(), u.getWater_consumed(), u.getIs_favourite(), u.getUserIsOnADiet()));
        request.getSession().setAttribute("u", u);
        return "/yourInformation";
    }
}
