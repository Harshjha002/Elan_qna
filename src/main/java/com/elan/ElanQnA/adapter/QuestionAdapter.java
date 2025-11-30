package com.elan.ElanQnA.adapter;

import com.elan.ElanQnA.dto.QuestionResponseDTO;
import com.elan.ElanQnA.models.Question;

public class QuestionAdapter {

    public  static QuestionResponseDTO toQuestionResponseDto(Question question){
        return QuestionResponseDTO.builder()
                .id(question.getId())
                .title(question.getTitle())
                .content(question.getContent())
                .createdAt(question.getCreatedAt())
                .build();
    }
}
