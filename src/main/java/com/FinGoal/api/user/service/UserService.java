package com.FinGoal.api.user.service;

import com.FinGoal.api.user.dto.UserRequestDto;
import com.FinGoal.api.user.dto.UserResponseDto;

public interface UserService {
    public Long createUser(UserRequestDto dto);
    public boolean login(String loginId, String pw);
    public void deleteUser(Long id, String pw);

}
