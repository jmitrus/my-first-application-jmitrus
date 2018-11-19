package com.example.myfirstapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class HelooResource  {
    @RestController
    public class HelooRescource (
            @GetMapping (path = "/api/hello")
            public String hello () {
    String { return "Hello world from the server"; }
}
