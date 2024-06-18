package com.example.demo.controller;

import com.example.demo.model.Task;
import com.example.demo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class TaskController {
    @Autowired
    private TaskRepository taskRepository;

    @PostMapping("/tasks")
    public Task create (@RequestBody Task task) {
        return taskRepository.save(task);
    }

    @GetMapping("/tasks")
    public Iterable<Task> getAll(){
        return taskRepository.findAll();
    }

    @GetMapping("/tasks/{id}")
    public Optional<Task> getById(@PathVariable Long id){
        return taskRepository.findById(id);
    }
    @PutMapping ("/tasks/{id}")
    public Task update (@PathVariable Long id, @RequestBody Task task){
        task.setId(id);
        System.out.println(task);
        return taskRepository.save(task);
    }

    @DeleteMapping("/tasks/{id}")
    public void delete (@PathVariable Long id) {
        taskRepository.deleteById(id);
    }

    @PutMapping("/tasks/{id}/markAsDone")
    public void patchMethod(@PathVariable Long id, @RequestBody Task task){
        taskRepository.markAsDone(id);
    }

    @PutMapping("/tasks/{id}:mark-as-done")
    public void patchMethod(@PathVariable Long id){
        taskRepository.markAsDone(id);
    }




}
