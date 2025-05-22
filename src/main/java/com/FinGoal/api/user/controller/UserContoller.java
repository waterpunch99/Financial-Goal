package com.FinGoal.api.user.controller;

import com.FinGoal.api.user.dto.UserRequestDto;
import com.FinGoal.api.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/user")
@RequiredArgsConstructor
@RestController
public class UserContoller {
    private final UserService userService;

    @PostMapping("/createUser")
    public ResponseEntity<Long> createUser(@RequestBody UserRequestDto userRequestDto){
        Long userId = userService.createUser(userRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(userId);
    }
    @PostMapping("/login")
    public void login(@RequestParam String loginId, @RequestParam String pw){
        userService.login(loginId, pw);
    }

}
