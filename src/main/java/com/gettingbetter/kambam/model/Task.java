package com.gettingbetter.kambam.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

import static java.time.LocalDateTime.now;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "task")
@Table(name = "task ")
public class Task extends EntityBase {

    private String title;
    private int yposition;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    @ManyToOne
    @JoinColumn(name = "columnId")
    private Columns column;

    @ManyToMany
    @JoinColumn(name = "TagId")
    private List<Tag> tags;



}
