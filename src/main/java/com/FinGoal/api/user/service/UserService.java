package com.FinGoal.api.user.service;

import com.FinGoal.api.user.dto.UserRequestDto;
import com.FinGoal.api.user.dto.UserResponseDto;

public interface UserService {
    public Long createUser(UserRequestDto dto);
    public UserResponseDto login(Long id, String pw);

}
