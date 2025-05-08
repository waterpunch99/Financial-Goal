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
    private Long currentAmount = 0L;
    private int progress;
    private LocalDate startDate;
    private LocalDate deadLine;

    public static GoalResponseDto fromEntity(Goal goal) {
        int progress = (goal.getTargetAmount() == 0) ? 0 :
                (int) ((double) goal.getCurrentAmount() / goal.getTargetAmount() * 100);

        return GoalResponseDto.builder()
                .id(goal.getId())
                .title(goal.getTitle())
                .targetAmount(goal.getTargetAmount())
                .currentAmount(goal.getCurrentAmount())
                .progress(progress)
                .startDate(goal.getStartDate())  // LocalDateTime → LocalDate
                .deadLine(goal.getDeadLine())
                .build();
    }
}
