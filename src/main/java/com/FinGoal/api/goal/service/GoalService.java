package com.FinGoal.api.goal.service;

import com.FinGoal.api.goal.domain.GoalRepository;
import com.FinGoal.api.goal.dto.GoalRequestDto;
import com.FinGoal.api.goal.dto.GoalResponseDto;

public interface GoalService {
    //목표추가
    public GoalResponseDto addGoal(GoalRequestDto goalRequestDto);
    //목표 수정
    public void updateGoal();




}
