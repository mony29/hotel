package edu.dali.hotel.controller;

import edu.dali.hotel.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

    @RequestMapping("/login_view")
    public String loginView() {
        return "login";
    }

    @PostMapping("/login")
    public String doLogin(@ModelAttribute("user") User user, ModelMap modelMap) {
        modelMap.addAttribute("user", user);
        // 返回到房间列表
        return "redirect:/rooms/to/room-list-page";
    }
}
