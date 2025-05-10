package com.FinGoal.api.user.service;

import com.FinGoal.api.user.domain.User;
import com.FinGoal.api.user.domain.UserRepository;
import com.FinGoal.api.user.dto.UserRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;
    @Override
    public String createUser(UserRequestDto dto) {
        User user = dto.toEntity();
        User saved = userRepository.save(user);
        return saved.getId();
    }
}
