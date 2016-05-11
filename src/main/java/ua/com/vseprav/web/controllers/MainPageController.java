package ua.com.vseprav.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainPageController {

    @RequestMapping(value = "/")
    public String index(Model model){
        model.addAttribute("appName","Pocket Dictionary Application");
        return "main_page";
    }

}
