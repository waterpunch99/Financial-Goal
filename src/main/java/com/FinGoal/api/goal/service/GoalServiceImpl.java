package com.FinGoal.api.goal.service;

import com.FinGoal.api.goal.domain.Goal;
import com.FinGoal.api.goal.domain.GoalRepository;
import com.FinGoal.api.goal.dto.GoalRequestDto;
import com.FinGoal.api.goal.dto.GoalResponseDto;
import com.FinGoal.api.user.domain.User;
import com.FinGoal.api.user.domain.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor


@Service
public class GoalServiceImpl implements GoalService{
    private final GoalRepository goalRepository;
    private final UserRepository userRepository;
    @Override
    public Long createGoal(GoalRequestDto goalRequestDto, Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new EntityNotFoundException("사용자 없음"));

        Goal goal = goalRequestDto.toEntity(user);
        Goal saved = goalRepository.save(goal);
        return saved.getId();
    }

    @Override
    public void updateGoal(Long id, GoalRequestDto dto) {
        Goal goal = goalRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException());
        goal.update(dto.getTitle(), dto.getTargetAmount(),
                dto.getStartDate(),
                dto.getDeadLine());
    }

    @Override
    public GoalResponseDto getGoal(Long id) {
    Goal goal = goalRepository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException());
        return GoalResponseDto.fromEntity(goal);
    }

    @Override
    public void addAmount(Long id, Long amount) {
        Goal goal = goalRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException());
        goal.addAmount(amount);
        goalRepository.save(goal);



    }
}
