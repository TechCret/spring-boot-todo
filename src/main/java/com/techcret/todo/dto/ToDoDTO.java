package com.techcret.todo.dto;

import java.time.format.DateTimeFormatter;
import com.techcret.todo.model.ToDo;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ToDoDTO {

    private String title;
    private String description;
    private String dateCreated;
    private String lastUpdated;
    private String uniqueId;
    private Boolean isDone;

    public ToDoDTO(ToDo toDo) {
        this.title = toDo.getTitle();
        this.description = toDo.getDescription();
        this.dateCreated =
                toDo.getDateCreated().format(DateTimeFormatter.ofPattern("dd/MMM/yyyy hh:mm:ss"));
        this.lastUpdated =
                toDo.getLastUpdated().format(DateTimeFormatter.ofPattern("dd/MMM/yyyy hh:mm:ss"));
        this.uniqueId = toDo.getUniqueId();
        this.isDone = toDo.getIsDone();
    }

}
