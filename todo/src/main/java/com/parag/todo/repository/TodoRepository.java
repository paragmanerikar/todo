package com.parag.todo.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

import com.parag.todo.entity.Todo;

import reactor.core.publisher.Flux;

@Repository
public interface TodoRepository extends R2dbcRepository<Todo, Integer>{
    Flux<Todo> findAllByStatus(String status);
}
