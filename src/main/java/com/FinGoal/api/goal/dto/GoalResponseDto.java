package com.FinGoal.api.goal.dto;

import com.FinGoal.api.goal.domain.Goal;
import lombok.Getter;
import lombok.Builder;

import java.time.LocalDate;

@Getter
@Builder
public class GoalResponseDto {

    private Long id;
    private String title;
    private Long targetAmount;
    private Long currentAmount;
    private double progress;
    private LocalDate startDate;
    private LocalDate deadLine;

    public static GoalResponseDto fromEntity(Goal goal) {

        return GoalResponseDto.builder()
                .id(goal.getId())
                .title(goal.getTitle())
                .targetAmount(goal.getTargetAmount())
                .currentAmount(goal.getCurrentAmount())
                .progress(goal.ProgressRate())
                .startDate(goal.getStartDate())
                .deadLine(goal.getDeadLine())
                .build();
    }
}
