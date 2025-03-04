package com.example.fittrack.Controllers;

import com.example.fittrack.Entity.Workout;
import com.example.fittrack.Services.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/workouts")
public class WorkoutController {
    @Autowired
    private WorkoutService workoutService;

    @PostMapping("/{userId}")
    public ResponseEntity<Workout> addWorkout(@PathVariable Long userId, @RequestBody Workout workout){
        return ResponseEntity.ok(workoutService.addWorkout(workout, userId));
    }

}
