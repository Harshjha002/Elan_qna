package com.elan.ElanQnA.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/v1/questions")
public class QuestionController {

    @GetMapping("/author/{authorId}")
    public Flux<QuestionResponse> getQuestionsByAuthor(@RequestParam String authorId){


    }
}
