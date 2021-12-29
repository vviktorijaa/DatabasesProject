package vrzhovskav.healthy_diet_application.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping
    public String getLoginPage(){
        return "login";
    }

    @PostMapping
    public String getHomePage(@RequestParam String username, Model model){
        model.addAttribute("username", username);
        return "redirect:/yourInformation";
    }
}
