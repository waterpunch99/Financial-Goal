package com.FinGoal.api.user.dto;

import com.FinGoal.api.user.domain.User;
import lombok.Builder;

@Builder
public class UserResponseDto {
    private Long id;
    private String username;

    public static UserResponseDto fromEntity(User user){
        return UserResponseDto.builder()
                .id(user.getId())
                .username(user.getUsername())
                .build();
    }

}
