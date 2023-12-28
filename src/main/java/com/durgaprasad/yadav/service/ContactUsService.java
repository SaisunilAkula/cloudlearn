package com.durgaprasad.yadav.service;

import com.durgaprasad.yadav.controller.repo.ContactUsRepo;
import com.durgaprasad.yadav.entity.ContactUs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactUsService {

    @Autowired
    private ContactUsRepo contactUsRepo;

    public void submitQuery(ContactUs contactUs) {
        contactUsRepo.save(contactUs);

    }

}
