package com.techcret.todo.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class ToDo implements Serializable {

    private static final long serialVersionUID = 5L;

    private String title;
    private String description;
    private LocalDateTime dateCreated;
    private LocalDateTime lastUpdated;
    private String uniqueId = UUID.randomUUID().toString();
    private Boolean isDone;

}
