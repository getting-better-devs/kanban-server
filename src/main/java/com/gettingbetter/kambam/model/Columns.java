package com.gettingbetter.kambam.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Columns extends EntityBase {
    private String title;
    private int xposition;

    @ManyToOne
    @JoinColumn(name = "boardId")
    private Board board;
}
