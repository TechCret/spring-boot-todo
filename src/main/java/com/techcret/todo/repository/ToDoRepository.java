package com.techcret.todo.repository;

import com.techcret.todo.model.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<ToDo,Long> {

}