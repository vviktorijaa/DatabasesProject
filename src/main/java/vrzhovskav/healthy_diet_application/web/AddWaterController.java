package vrzhovskav.healthy_diet_application.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/addWater")
public class AddWaterController {

    @GetMapping
    public String getAddWaterPage(){
        return "addWater";
    }

    @PostMapping
    public String addWater(){
        return "redirect:/home";
    }
}
