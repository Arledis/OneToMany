package com.example.codeclan.Filetrackerserive.repository;

import com.example.codeclan.Filetrackerserive.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
