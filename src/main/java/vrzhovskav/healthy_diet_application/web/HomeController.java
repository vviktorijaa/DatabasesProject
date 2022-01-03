package vrzhovskav.healthy_diet_application.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vrzhovskav.healthy_diet_application.model.User;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping
    public String getHomePage(HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("u");
        return "home";
    }

    @GetMapping("/addCalories")
    public String getUpdateCaloriesPage(){
        return "addCalories";
    }
}
