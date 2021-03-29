package io.github.lc101alexgerrit.todoapp.task;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {

    Task findById(long id);

    @Override
    List<Task> findAll();

}
