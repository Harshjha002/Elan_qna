package com.elan.ElanQnA.controllers;


import com.elan.ElanQnA.dto.QuestionRequestDTO;
import com.elan.ElanQnA.dto.QuestionResponseDTO;
import com.elan.ElanQnA.services.IQuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/questions")
public class QuestionController {


    private final IQuestionService questionService;

   @PostMapping()
    public Mono<QuestionResponseDTO> createQuestion(@RequestBody QuestionRequestDTO questionRequestDTO){
    return questionService.createQuestion(questionRequestDTO)
            .doOnSuccess(response -> System.out.println("Question Created SuccessFully : " + response))
            .doOnError(error -> System.out.println("Error creating question: "+ error));
   }

   @GetMapping("/{id}")
    public  Mono<QuestionResponseDTO> getQuestionById(@PathVariable String id){
       throw new UnsupportedOperationException("Not Implemented");
   }

    @GetMapping()
    public  Flux<QuestionResponseDTO> getAllQuestion(@PathVariable String id){
        throw new UnsupportedOperationException("Not Implemented");
    }

    @DeleteMapping("/{id}")
    public  Mono<QuestionResponseDTO> deleteQuestionById(@PathVariable String id){
        throw new UnsupportedOperationException("Not Implemented");
    }

    @GetMapping("/search")
    public  Flux<QuestionResponseDTO> searchQuestion(
            @RequestParam String query,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ){
        throw new UnsupportedOperationException("Not Implemented");
    }

    @GetMapping("/tag/{tag}")
    public  Flux<QuestionResponseDTO> getQuestionByTag(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ){
        throw new UnsupportedOperationException("Not Implemented");
    }

}
