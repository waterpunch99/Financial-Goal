package com.FinGoal.api.user.domain;

import com.FinGoal.api.goal.domain.Goal;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Entity
public class User {

    @Id
    private Long id;
    private String loginId;
    private String pw;
    private String username;
    @OneToMany
    @JoinColumn(name = "goal_id")
    private List<Goal> goal = new ArrayList<>();
    @Builder
    public User(Long id, String loginId, String pw, String username){
        this.id = id;
        this.pw = pw;
        this.username = username;
    }

}
