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
    public String addCalories(@RequestParam Integer consumedKcal,
                              HttpServletRequest request){
        User u = (User) request.getSession().getAttribute("u");
        User user = this.userService.findByUsername(u.getUsername());
        Integer kcal = consumedKcal + u.getKcal_consumed();

        this.userService.updateKcal(user.getUsername_id(), kcal);

        request.getSession().setAttribute("u", user);
        return "redirect:/home";
    }
}