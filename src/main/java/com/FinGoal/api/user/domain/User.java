package com.FinGoal.api.user.domain;

import com.FinGoal.api.goal.domain.Goal;
import com.FinGoal.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "member")
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String loginId;
    private String pw;
    private String username;
    @OneToMany(mappedBy = "user")
    private List<Goal> goal = new ArrayList<>();

    public boolean checkPassword(String pw) {
        return this.pw.equals(pw);
    }
    @Builder
    public User(Long id, String loginId, String pw, String username){
        this.id = id;
        this.loginId = loginId;
        this.pw = pw;
        this.username = username;
    }

}
