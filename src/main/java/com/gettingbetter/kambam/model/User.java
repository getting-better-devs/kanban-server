package com.gettingbetter.kambam.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User extends EntityBase {
    private String nome;
    private String email;
    private LocalDateTime createdAt;
}
