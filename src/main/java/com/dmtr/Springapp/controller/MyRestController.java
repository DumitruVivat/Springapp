package com.dmtr.Springapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @Value("${first.text}")
    private String hello;
    @Value("${my.car}")
    private String nameOfCar;
    @Value("${my.city}")
    private String nameOfCity;

    @GetMapping("/carcity")
    public String infoOfMyCarAndCity() {
        return "My car = " + nameOfCar + ".\n"
                + "my city = " + nameOfCity + ".";
    }
    @GetMapping("/")
    public String helloWorld() {
        return hello;
    }
}
