package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.*;

@Controller
public class InputController {

    private List<String> list = new ArrayList<>();

    @GetMapping("/input")
    public String input() {
        return "input";
    }

    @PostMapping("/input")
    public String input(String word) {
        list.add(word);
        return "input";
    }

    @GetMapping("/test")
    public String test(Model model) {
        List<Integer> randomList = new ArrayList<>();
        int size = list.size();
        while (randomList.size() < size) {
            Double d = Math.random() * size + 1;

            if(randomList.contains(d.intValue())) {
                continue;
            } else {
                randomList.add(Integer.valueOf(d.intValue()));
            }
        }

        List<String> tmpList = new ArrayList<>();
        for(int i=0;i<randomList.size();i++) {
            String word = list.get(randomList.get(i)-1);
            tmpList.add(word);
        }

        model.addAttribute("tmpList", tmpList);
        model.addAttribute("title", "Solve the problem!");
        return "test";
    }
}
