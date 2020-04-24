package com.techcret.todo.service;

import java.util.ArrayList;
import java.util.List;
import com.techcret.todo.commandObject.ToDoCO;
import com.techcret.todo.dto.ToDoDTO;
import com.techcret.todo.model.ToDo;
import com.techcret.todo.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {

    @Autowired
    private ToDoRepository toDoRepository;

    public List<ToDoDTO> list() {
        List<ToDoDTO> toDoDTOList = new ArrayList<>();
        toDoRepository.findAll().forEach(toDo -> toDoDTOList.add(new ToDoDTO(toDo)));
        return toDoDTOList;
    }

    public void save(ToDoCO toDoCO){
        ToDo toDo = new ToDo(toDoCO);
        toDoRepository.save(toDo);
    }

}
