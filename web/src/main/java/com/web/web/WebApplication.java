package com.web.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class WebApplication {

    @GetMapping("/login")
    public ModelAndView login(){
        ModelAndView ma=new ModelAndView();
        ma.setViewName("/login");
        return ma;
    }

    @GetMapping("/view/index")
    public ModelAndView view_index(){
        ModelAndView ma=new ModelAndView();
        ma.setViewName("/view/index");
        return ma;
    }



    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}
