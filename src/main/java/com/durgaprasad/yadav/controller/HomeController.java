package com.durgaprasad.yadav.controller;

import com.durgaprasad.yadav.entity.ContactUs;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String getHomePage() {
        return "index";
    }


    @GetMapping("/public/register")
    public String getRegisterPage() {
        return "auth";
    }

    @GetMapping("/public/contactus")
    public String getContactUsPage(Model model) {
        model.addAttribute("contactForm", new ContactUs());
        return "contactus";
    }

    @GetMapping("/public/resources")
    public String getResourcesPage(){
        return "resources";
    }

}
