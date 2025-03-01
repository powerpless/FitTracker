package com.example.fittrack.Services;

import com.example.fittrack.Entity.User;
import com.example.fittrack.Repo.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User addUser(User user) {
        return userRepository.save(user);
    }
}
