package com.elan.ElanQnA.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Question {
    @Id
    private  String id;

    @NotNull(message = "Title is required")
    private  String title;

    private String authorId;
}
