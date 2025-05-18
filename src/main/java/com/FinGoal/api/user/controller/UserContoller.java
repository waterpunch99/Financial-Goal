package com.FinGoal.api.user.controller;

import com.FinGoal.api.user.dto.UserRequestDto;
import com.FinGoal.api.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/api/user")
@RequiredArgsConstructor
@RestController
public class UserContoller {
    private final UserService userService;

    @PostMapping("/createUser")
    public ResponseEntity<Long> createUser(UserRequestDto userRequestDto){
        Long userId = userService.createUser(userRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(userId);
    }
    @PostMapping("/login")
    public void login(String loginId, String pw){
        userService.login(loginId, pw);
    }

}
