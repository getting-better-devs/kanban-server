package com.gettingbetter.kambam.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserBoards {
    @EmbeddedId
    UserBoardsKey id;


    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne
    @MapsId("boardId")
    @JoinColumn(name = "boardId")
    private Board board;

    private boolean owner;
}
