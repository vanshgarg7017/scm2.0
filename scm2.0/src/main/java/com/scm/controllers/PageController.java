package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    // Home page handler
    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("Home page handler");
        model.addAttribute("name", "Substring Technology");
        model.addAttribute("YoutubeChannel", "Learn code with Durgesh");
        model.addAttribute("githubRepo", "https://github.com/vanshgarg7017");
        return "home"; // returns the "home" view
    }

    @RequestMapping("/about")
    public String aboutPage(Model model) {
        model.addAttribute("isLogin", true);
        System.out.println("This is all about the about page");
        return "about";
    }

    @RequestMapping("/services")
    public String servicesPage() {
        System.out.println("Service page loading");
        return "services";
    }

    @RequestMapping("/login")
    public String loginPage() {
        System.out.println("Login page loading");
        return "login";
    }

    @RequestMapping("/contacts")
    public String contactPage() {
        System.out.println("Contact Page loading ");
        return "contacts";
    }
}
