package com.durgaprasad.yadav.controller;


import com.durgaprasad.yadav.entity.ContactUs;
import com.durgaprasad.yadav.service.ContactUsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactUsController {

    @Autowired
    private ContactUsService contactUsService;

    @PostMapping("/public/contactus/submit")
    public String submit(@ModelAttribute ContactUs contactUs) {
        contactUsService.submitQuery(contactUs);
        return "contactsubmittedpage";

    }


}
