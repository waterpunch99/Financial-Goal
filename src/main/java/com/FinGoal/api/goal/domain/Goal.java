package com.FinGoal.api.goal.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
public class Goal {
    @Id
    private Long id;
    private String title;
    private Long targetAmount;
    private Long currentAmount = 0L;
    private LocalDate startDate;
    private LocalDate deadLine;

}
