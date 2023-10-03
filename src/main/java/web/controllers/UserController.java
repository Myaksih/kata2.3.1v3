package web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

    @GetMapping()
    public String allUsers(Model model){
        return "cars";
    }

    @GetMapping("id")
    public String show(int id,
                       Model model){
        return null;
    }


}
