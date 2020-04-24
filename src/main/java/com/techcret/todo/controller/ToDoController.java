package com.techcret.todo.controller;

import com.techcret.todo.commandObject.ToDoCO;
import com.techcret.todo.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class ToDoController {

    @Autowired
    private ToDoService toDoService;

    @GetMapping(value = "/list")
    public String list(Model model) {
        log.info("ToDo List Page");
        model.addAttribute("toDoList", toDoService.list());
        return "/toDo/list.html";
    }

    @GetMapping(value = "/create")
    public String create() {
        log.info("ToDo Create Page");
        return "/toDo/create.html";
    }

    @PostMapping(value = "/save")
    public String save(@ModelAttribute ToDoCO toDoCO) {
        log.info("ToDo Save Page");
        toDoService.save(toDoCO);
        return "redirect:/list";
    }

}
