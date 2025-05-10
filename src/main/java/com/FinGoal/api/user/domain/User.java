package com.FinGoal.api.user.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Entity
public class User {

    @Id
    private Long id;
    private String pw;
    private String username;
    @Builder
    public User(Long id, String pw, String username){
        this.id = id;
        this.pw = pw;
        this.username = username;
    }

}
