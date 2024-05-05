package com.parag.todo.entity;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Todo {
    @Id
    private Integer id;
    private String title;
    private String description;
    private String targetDate;
    private String status;
}
