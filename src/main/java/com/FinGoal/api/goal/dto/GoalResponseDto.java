package com.FinGoal.api.goal.dto;

import java.time.LocalDate;

public class GoalResponseDto {
    private Long id;
    private String title;
    private Long targetAmount;
    private Long currentAmount = 0L;
    private LocalDate startDate;
    private LocalDate deadLine;
}
