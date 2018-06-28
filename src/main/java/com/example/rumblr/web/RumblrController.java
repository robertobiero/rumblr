package com.example.rumblr.web;


import com.example.rumblr.backend.RumblrService;
import com.example.rumblr.backend.UserService;
import com.example.rumblr.domain.Rumble;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.rumblr.domain.User;

import javax.validation.Valid;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("/rumbles")
public class RumblrController {

    private static final String MAX_LONG_AS_STRING = "" + Long.MAX_VALUE;


    private RumblrService rumblrService;



    @Autowired
    UserService userService;

    @Autowired
    public RumblrController(RumblrService rumblrService){

        this.rumblrService = rumblrService;


    }


    @RequestMapping(value = "/rumb", method = GET)
    public String rumbles(Model model){

        model.addAttribute(
               rumblrService.findAll());
        return "rumbles";

    }


    @RequestMapping(value = "/rum", method = GET)
    public List<Rumble> spittles(
            @RequestParam(value="max",
                    defaultValue=MAX_LONG_AS_STRING) long max,
            @RequestParam(value="count", defaultValue="20") int count) {
        return rumblrService.findAll();
    }

    @RequestMapping(value="/{rumbleId}", method= GET)
    public String rumble(
            @PathVariable("rumbleId") long rumbleId,
            Model model) {
        model.addAttribute(rumblrService.findById(rumbleId));
        return "rumble";
    }

    @RequestMapping(value="/register", method= GET)
    public String showRegistrationForm(Model model)
    {

        model.addAttribute(new User());
        return "registerForm";
    }

    @RequestMapping(value="/register", method=RequestMethod.POST)
    public String processRegistration(@Valid User user, Errors errors) {

        if(errors.hasErrors()){
            return "registerForm";
        }
        userService.save(user);

        return "redirect:/rumbles/" +
                user.getUsername();
    }

    @RequestMapping(value="/{username}", method=GET)
    public String showSpitterProfile(
            @PathVariable String username, Model model) {
        User user = userService.findByUsername(username);
        model.addAttribute(user);
        return "profile";
    }

}
