package com.FinGoal.api.goal.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

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



    public void addAmount(Long amount) {
        if (amount == null || amount <= 0) {
            throw new IllegalArgumentException("양수를 입력하세요");
        }
        this.currentAmount += amount;
    }
    public void update(String title, Long targetAmount, LocalDate startDate, LocalDate deadLine) {
        this.title = title;
        this.targetAmount = targetAmount;
        this.startDate = startDate;
        this.deadLine = deadLine;
    }



}
