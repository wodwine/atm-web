package th.ac.ku.atm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String getHomePage(Model model) {
        model.addAttribute("greeting", "Hello there!!");
        // return home.html
        return "home";
    }

    @RequestMapping("")
    public String getFirstPage(Model model) {
        model.addAttribute("greeting", "Hello there!!");
        // return home.html
        return "home";
    }
}

