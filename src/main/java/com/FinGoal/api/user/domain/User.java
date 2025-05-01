package com.FinGoal.api.user.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

import java.time.LocalDateTime;


@Getter
@Entity
public class User {

    @Id
    private String id;
    private String pw;
    private String name;
    private LocalDateTime joinAt;

}
