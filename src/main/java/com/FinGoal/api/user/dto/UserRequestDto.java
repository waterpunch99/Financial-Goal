package com.FinGoal.api.user.dto;

import com.FinGoal.api.user.domain.User;
import lombok.Getter;

@Getter
public class UserRequestDto {

    private Long id;
    private String pw;
    private String username;

    public User toEntity(){
        return User.builder()
                .id(this.id)
                .pw(this.pw)
                .username(this.username)
                .build();
    }
}
