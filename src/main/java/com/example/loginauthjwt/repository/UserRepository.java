package com.example.loginauthjwt.repository;

import com.example.loginauthjwt.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
