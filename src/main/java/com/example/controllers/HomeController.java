package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created on 4/27/2017.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
