package com.FinGoal.api.goal.dto;

import com.FinGoal.api.goal.domain.Goal;
import com.FinGoal.api.user.domain.User;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class GoalRequestDto {
    private String title;
    private Long targetAmount;
    private LocalDate startDate;
    private LocalDate deadLine;


    public Goal toEntity(User user){
        return Goal.builder()
                .title(this.title)
                .targetAmount(this.targetAmount)
                .startDate(this.startDate)
                .deadLine(this.deadLine)
                .user(user)
                .build();
    }
}
