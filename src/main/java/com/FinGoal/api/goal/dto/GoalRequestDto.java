package com.FinGoal.api.goal.dto;

import com.FinGoal.api.goal.domain.Goal;

import java.time.LocalDate;


public class GoalRequestDto {
    private String title;
    private Long targetAmount;
    private LocalDate startDate;
    private LocalDate deadLine;

    public Goal toEntity(){
        return Goal.builder()
                .title(this.title)
                .targetAmount(this.targetAmount)
                .startDate(this.startDate)
                .deadLine(this.deadLine)
                .build();
    }
}
