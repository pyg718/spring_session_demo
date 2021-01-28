package com.offcn.controller;

import com.offcn.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThreeThymeleafController {

    @GetMapping("/three")
    public String indexPage(Model model){
        List<User> list = new ArrayList<>();
        User user1 = new User();
        user1.setId(1);
        user1.setName("Male_bend");
        user1.setAge(21);
        list.add(user1);

        User user2 = new User();
        user2.setId(2);
        user2.setName("bend");
        user2.setAge(21);
        list.add(user2);

        User user3 = new User();
        user3.setId(3);
        user3.setName("haha");
        user3.setAge(21);
        list.add(user3);

        model.addAttribute("userList", list);
        return "index3";
    }
}
