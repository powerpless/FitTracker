package com.example.fittrack.DTO;

import lombok.Data;

@Data
public class SignUpRequest {
    private String username;
    private String email;
    private String password;

}
