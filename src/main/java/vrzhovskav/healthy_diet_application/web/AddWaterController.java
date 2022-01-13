package vrzhovskav.healthy_diet_application.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vrzhovskav.healthy_diet_application.model.User;
import vrzhovskav.healthy_diet_application.service.UserService;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/addWater")
public class AddWaterController {

    private final UserService userService;

    public AddWaterController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getAddWaterPage(){
        return "addWater";
    }

    @PostMapping
    public String addWater(@RequestParam Integer consumedWater,
                           HttpServletRequest request){
        User u = (User) request.getSession().getAttribute("u");
        User user = this.userService.findByUsername(u.getUsername());
        Integer water = consumedWater + u.getWater_consumed();

        this.userService.updateWater(user.getUsername_id(), water);

        request.getSession().setAttribute("u", user);
        return "redirect:/home";
    }
}
