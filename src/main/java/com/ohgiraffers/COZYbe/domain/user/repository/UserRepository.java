package com.ohgiraffers.COZYbe.domain.user.repository;

import com.ohgiraffers.COZYbe.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> findByEmail(String email);
    Optional<User> findByNickname(String nickName);
}
