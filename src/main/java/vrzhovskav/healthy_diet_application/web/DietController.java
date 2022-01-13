package vrzhovskav.healthy_diet_application.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vrzhovskav.healthy_diet_application.model.Diet;
import vrzhovskav.healthy_diet_application.model.User;
import vrzhovskav.healthy_diet_application.service.DietService;
import vrzhovskav.healthy_diet_application.service.UserService;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/diets")
public class DietController {

    private final DietService dietService;
    private final UserService userService;

    public DietController(DietService dietService, UserService userService) {
        this.dietService = dietService;
        this.userService = userService;
    }

    @GetMapping
    public String getDietsPage(Model model){
        model.addAttribute("allDiets", dietService.findAll());
        return "diets";
    }

    @GetMapping("/diet/{id}")
    public String getRecipeById(@PathVariable Integer id,
                                Model model){
        Diet d = this.dietService.findById(id);
        model.addAttribute("diet", d);
        return "/showDiets";
    }

    @PostMapping("/addToFavourites/{id}")
    public String addToFave(@PathVariable Integer id,
                            HttpServletRequest request){
//        User u = (User) request.getSession().getAttribute("u");
//        User user = this.userService.findByUsername(u.getUsername());
//
//        Diet d = this.dietService.findById(id);
//
//        this.userService.updateDiets(user.getUsername_id(), d);
//
//        request.getSession().setAttribute("u", user);
        return "redirect:/myProfile";
    }
}
