package io.github.lc101alexgerrit.todoapp.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping("/task/{id}")
    public Task getTaskById(@PathVariable long id) {
        return taskRepository.findById(id);
    }

    @PostMapping("/task")
    public void addNewTask(@RequestBody @Valid Task task) {
        taskRepository.save(task);
    }

}
