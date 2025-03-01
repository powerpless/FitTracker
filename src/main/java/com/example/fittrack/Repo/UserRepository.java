package com.example.fittrack.Repo;

import com.example.fittrack.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
}
