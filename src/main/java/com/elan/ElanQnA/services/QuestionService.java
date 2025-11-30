package com.elan.ElanQnA.services;


import com.elan.ElanQnA.adapter.QuestionAdapter;
import com.elan.ElanQnA.dto.QuestionRequestDTO;
import com.elan.ElanQnA.dto.QuestionResponseDTO;
import com.elan.ElanQnA.models.Question;
import com.elan.ElanQnA.repo.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class QuestionService implements IQuestionService {

    private final QuestionRepository questionRepository;

    @Override
    public Mono<QuestionResponseDTO> createQuestion(QuestionRequestDTO questionRequestDTO){

        Question question = Question.builder()
                .title(questionRequestDTO.getTitle())
                .content(questionRequestDTO.getContent())
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();

        return questionRepository.save(question)
                .map(QuestionAdapter::toQuestionResponseDto)
                .doOnSuccess(response -> System.out.println("Question Created SuccessFully : " + response))
                .doOnError(error -> System.out.println("Error creating question: "+ error));


    }
}
