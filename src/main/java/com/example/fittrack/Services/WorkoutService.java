package com.example.fittrack.Services;

import com.example.fittrack.Entity.User;
import com.example.fittrack.Entity.Workout;
import com.example.fittrack.Repo.UserRepository;
import com.example.fittrack.Repo.WorkoutRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WorkoutService {
    private final WorkoutRepository workoutRepository;
    private final UserRepository userRepository;

    public Workout addWorkout(Workout workout, Long userId){
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("Пользователь не найден"));
        workout.setUser(user);
        return workoutRepository.save(workout);
    }

    public List<Workout> getWorkoutsByUser(Long id){
        return workoutRepository.findByUserId(id);
    }
}
