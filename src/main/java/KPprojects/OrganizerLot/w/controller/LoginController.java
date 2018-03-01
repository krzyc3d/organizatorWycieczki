package KPprojects.OrganizerLot.w.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/loginPage")
    public String loginForm() {
        return "loginForm";
    }

    @GetMapping("/errorPage")
    public String loginFailure() {
        return "loginFailure";
    }

    @GetMapping("/accessDenied")
    public String accessDenied() {
        return "accessDenied";
    }
}
