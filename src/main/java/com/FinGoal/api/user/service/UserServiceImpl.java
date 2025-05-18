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
    public Long createUser(UserRequestDto userRequestDto) {
        User user = userRequestDto.toEntity();
        User saved = userRepository.save(user);
        return saved.getId();
    }

    @Override
    public boolean login(String loginId, String pw) {
    return userRepository.findByLoginId(loginId)
            .map(u -> u.checkPassword(pw)).orElse(false);

    }

    @Override
    public void deleteUser(Long id, String pw) {

    }
}
