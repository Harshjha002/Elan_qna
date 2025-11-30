package com.elan.ElanQnA.services;

import com.elan.ElanQnA.dto.QuestionRequestDTO;
import com.elan.ElanQnA.dto.QuestionResponseDTO;
import com.elan.ElanQnA.models.Question;
import reactor.core.publisher.Mono;

public interface IQuestionService {
    public Mono<QuestionResponseDTO> createQuestion(QuestionRequestDTO question);
}
