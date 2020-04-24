package com.techcret.todo.controller;

import com.techcret.todo.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/todo")
public class ToDoController {

    @Autowired
    private ToDoService toDoService;

    @GetMapping(value = "/login")
    public String list(Model model) {
        log.info("ToDo List Page");
        model.addAttribute("toDoList", toDoService.list());
        return "/toDo/list.html";
    }

}
