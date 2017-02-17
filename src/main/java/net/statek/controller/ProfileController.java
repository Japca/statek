package net.statek.controller;

import net.statek.View;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfileController {

    @RequestMapping(value = "/profile")
    public String profile(Model model) {
        return View.PROFILE.getName();
    }
}
