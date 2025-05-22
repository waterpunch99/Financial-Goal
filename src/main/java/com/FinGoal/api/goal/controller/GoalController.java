package com.FinGoal.api.goal.controller;


import com.FinGoal.api.goal.dto.GoalRequestDto;
import com.FinGoal.api.goal.dto.GoalResponseDto;
import com.FinGoal.api.goal.service.GoalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/api/goals")
@RequiredArgsConstructor
@RestController
public class GoalController {
    private final GoalService goalService;

    @PostMapping
    public ResponseEntity<Long> createGoal(@RequestBody GoalRequestDto goalRequestDto, @RequestParam Long userId){
        Long goalId = goalService.createGoal(goalRequestDto, userId);
        return ResponseEntity.status(HttpStatus.CREATED).body(goalId);
    }

    @PutMapping("/{id}")
    public void updateGoal(@PathVariable Long id, @RequestBody GoalRequestDto dto){
        goalService.updateGoal(id, dto);

    }

    @GetMapping("/{id}")
    public ResponseEntity<GoalResponseDto> getGoal(@PathVariable Long id){
        GoalResponseDto dto = goalService.getGoal(id);
        return ResponseEntity.ok(dto);
    }

    @PostMapping("/{id}/amount")
    public void addAmount(@PathVariable Long id, @RequestBody Long amount){
        goalService.addAmount(id, amount);
    }




}
