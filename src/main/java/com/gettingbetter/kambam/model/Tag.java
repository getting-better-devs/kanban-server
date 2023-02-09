package com.gettingbetter.kambam.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Tag extends EntityBase{
    private String name;

    private String backGroundColor;


    @ManyToMany
    @JoinColumn(name = "taskId")
    private List<Task> tasks;

}
