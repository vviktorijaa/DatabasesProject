package vrzhovskav.healthy_diet_application.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vrzhovskav.healthy_diet_application.model.User;
import vrzhovskav.healthy_diet_application.service.PrikazhiKorisnikService;
import vrzhovskav.healthy_diet_application.service.UserService;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/myProfile")
public class MyProfileController {

    private final UserService userService;
    private final PrikazhiKorisnikService prikazhiKorisnikService;

    public MyProfileController(UserService userService, PrikazhiKorisnikService prikazhiKorisnikService) {
        this.userService = userService;
        this.prikazhiKorisnikService = prikazhiKorisnikService;
    }

    @GetMapping
    public String getProfilePage(HttpServletRequest request,
                                 Model model){
        User user = (User) request.getSession().getAttribute("u");
        String username = user.getUsername();
        model.addAttribute("u", this.prikazhiKorisnikService.findUser(username));
        return "myProfile";
    }
}
