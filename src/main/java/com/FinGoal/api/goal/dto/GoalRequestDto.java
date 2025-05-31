package com.FinGoal.api.goal.dto;

import com.FinGoal.api.goal.domain.Goal;
import com.FinGoal.api.user.domain.User;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class GoalRequestDto {
    @NotNull
    private String title;
    @NotNull
    private Long targetAmount;
    @NotNull
    private LocalDate startDate;
    @NotNull
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
