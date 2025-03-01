package com.example.fittrack.Repo;

import com.example.fittrack.Entity.Workout;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorkoutRepository extends JpaRepository <Workout, Long> {
    List<Workout> findByUserId(Long id);
}
