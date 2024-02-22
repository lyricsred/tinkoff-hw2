package com.example.controllers;

import com.example.dao.RandomValueResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("/api/v1/random")
public class RandomController {
    private final Integer randomVal;

    public RandomController() {
        randomVal = (int)(Math.random() * 100000);
    }

    @GetMapping
    public ResponseEntity<RandomValueResponse> getRandomValue() {
        System.out.println("Random value has been requested: " + new Date());
        return new ResponseEntity<RandomValueResponse>(new RandomValueResponse(randomVal), HttpStatus.OK);
    }
}
