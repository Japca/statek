package net.statek.controller;


import net.statek.View;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutController {

    @RequestMapping(value = "/about")
    public String about(Model model) {
        return View.ABOUT.getName();
    }
}
