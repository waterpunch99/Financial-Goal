package com.FinGoal.api.goal.service;

import com.FinGoal.api.goal.domain.GoalRepository;
import com.FinGoal.api.goal.dto.GoalRequestDto;
import com.FinGoal.api.goal.dto.GoalResponseDto;

public interface GoalService {
    //목표추가
    public Long CreateGoal(GoalRequestDto goalRequestDto);
    //목표 수정
    public void updateGoal(Long id, GoalRequestDto dto);
    //목표 상세 조회
    public GoalResponseDto getGoal(Long id);
    //금액 입력
    public void addAmount(Long id, Long amount);




}
