package com.gettingbetter.kambam.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class UserBoardsKey implements Serializable {

    @Column(name = "userId")
    private User user;

    @Column(name = "boardId")
    private Board board;



}
