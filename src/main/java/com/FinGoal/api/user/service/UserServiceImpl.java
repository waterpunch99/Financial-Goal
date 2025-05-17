package com.FinGoal.api.user.service;

import com.FinGoal.api.user.domain.User;
import com.FinGoal.api.user.domain.UserRepository;
import com.FinGoal.api.user.dto.UserRequestDto;
import com.FinGoal.api.user.dto.UserResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;
    @Override
    public Long createUser(UserRequestDto dto) {
        User user = dto.toEntity();
        User saved = userRepository.save(user);
        return saved.getId();
    }

    @Override
    public UserResponseDto login(Long id, String pw) {

        return null;
    }
}
