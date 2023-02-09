package com.gettingbetter.kambam.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SubTasks extends EntityBase{
    @ManyToOne
    private Task task;
    private boolean completed;

    @ManyToOne
    private User completedBy;
    private LocalDateTime completedAt;



}
