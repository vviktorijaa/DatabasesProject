package vrzhovskav.healthy_diet_application.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vrzhovskav.healthy_diet_application.service.UserService;

@Controller
@RequestMapping("/yourInformation")
public class YourInformationController {

    private final UserService userService;

    public YourInformationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getYourInformationPage(){
        return "yourInformation";
    }
}
