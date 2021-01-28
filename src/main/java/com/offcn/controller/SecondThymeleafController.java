package com.offcn.controller;

import com.offcn.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class SecondThymeleafController {

    @GetMapping("/second")
    public String indexPage(Model model){
        String message = "Hello, Thymeleaf!";
        User user = new User();
        user.setId(1);
        user.setName("Turbo");
        user.setAge(21);

        Map<String, Object> map = new HashMap<>();
        map.put("src1","1.jpg");
        map.put("src2","2.jpg");
        model.addAttribute("message",message);
        model.addAttribute("user",user);
        model.addAttribute("src",map);
        return "index2";
    }
}
