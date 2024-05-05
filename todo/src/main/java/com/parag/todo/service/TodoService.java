package com.parag.todo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parag.todo.entity.Todo;
import com.parag.todo.repository.TodoRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public Flux<Todo> getTodosByStatus(String status) {
        return todoRepository.findAllByStatus(status);
    }

    public Mono<Todo> getTodoById(Integer id) {
       return todoRepository.findById(id);
    }

    public Mono<Todo> createNewTodo(Todo todo) {
       return todoRepository.save(todo);
    }

    public Mono<Todo> updateTodo(Integer id, Todo todo) {
        return todoRepository.findById(id)
            .map(Optional::of)
            .defaultIfEmpty(Optional.empty())
            .flatMap(optionalTodo -> {
                if (optionalTodo.isPresent()) {
                    todo.setId(id);
                    return todoRepository.save(todo);
                }
            return Mono.empty();
            });
    }

    public void deleteTodo(Integer id) {
        todoRepository.deleteById(id);
    }




}
