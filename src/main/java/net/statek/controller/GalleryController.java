package net.statek.controller;


import net.statek.domain.View;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GalleryController {

    @RequestMapping(value = "/gallery")
    public String gallery(Model model) {
        return View.GALLERY.getName();
    }
}
