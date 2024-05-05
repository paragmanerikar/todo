package com.parag.todo.controller;
import org.springframework.web.bind.annotation.RestController;

import com.parag.todo.entity.Todo;
import com.parag.todo.service.TodoService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/todos")
@Validated
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping
    public Flux<Todo> getTodosByStatus(@RequestParam(value = "TODO", required = false) String status) {
        return todoService.getTodosByStatus(status);
    }

    @GetMapping("/{id}")
    public Mono<Todo> getTodoById(@RequestParam Integer id) {
        return todoService.getTodoById(id);
    }

    @PostMapping
    public Mono<Todo> createNewTodo(@RequestBody Todo todo) {
        return todoService.createNewTodo(todo);       
    }

    @PutMapping("/{id}")
    public Mono<Todo> updateTodo(@PathVariable Integer id, @RequestBody Todo todo) {
        return todoService.updateTodo(id, todo);
    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Integer id) {
        todoService.deleteTodo(id);
    }

}