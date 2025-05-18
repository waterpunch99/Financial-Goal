package com.FinGoal.api.user.domain;

import org.apache.el.stream.Stream;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {

    Optional<User> findByLoginId(String loginId);
}
