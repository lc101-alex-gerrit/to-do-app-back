package io.github.lc101alexgerrit.todoapp.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping("/tasks")
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @GetMapping("/task/{id}")
    public Task getTaskById(@PathVariable long id) {
        return taskRepository.findById(id);
    }

    @PostMapping("/task")
    public Task addNewTask(@RequestBody @Valid Task task) {
        return taskRepository.save(task);
    }

    @PutMapping("/task/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody @Valid Task task) {
        return taskRepository.save(task);
    }

    @DeleteMapping("/task/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskRepository.deleteById(id);
    }

}
