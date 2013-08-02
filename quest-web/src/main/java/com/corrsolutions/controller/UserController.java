package com.corrsolutions.controller;

import com.corrsolutions.quest.domain.GameUser;
import com.corrsolutions.quest.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/createUser", method = RequestMethod.GET)
    public String showUserForm(Model model) {
        model.addAttribute("user", new GameUser());
        return "createUser";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String saveUser(Model model, GameUser user) {
/*        GameUser existing = userService.findByUserName(user.getUserName());
        if (existing != null) {
            model.addAttribute("status", "exist");
            return "createUser";
        }*/
        user.setCreatedOn(new Date());
        userService.saveUser(user);
        model.addAttribute("saved", "success");
        return "createUser";
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String searchUser(Model model, GameUser user) {
        List<GameUser> users = userService.findUsers(user.getUserName());
        model.addAttribute("users", users);
        model.addAttribute("search", true);
        return "createUser";
    }

    @RequestMapping(value = "/edit/{userName}", method = RequestMethod.GET)
    public String updateUser(Model model, @PathVariable String userName) {
        GameUser user = userService.findByUserName(userName);
        model.addAttribute("user", user);
        return "update";
    }


    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateUser(Model model, GameUser user) {
        userService.saveUser(user);
        model.addAttribute("saved", "success");
        return "update";
    }

    @RequestMapping(value = "/delete/{userName}", method = RequestMethod.GET)
    public String deleteUser(Model model, @PathVariable String userName) {
        userService.deleteUser(userName);
        model.addAttribute("deleted", "success");
        model.addAttribute("user", new GameUser());
        return "index";
    }

}
