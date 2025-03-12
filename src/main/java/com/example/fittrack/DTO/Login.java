package com.example.fittrack.DTO;

public class Login {
    private boolean success;
    private String token;
    private long expirationTime;
    private String username;
    private String message;

    public Login(boolean success, String token, long expirationTime, String username, String message) {
        this.success = success;
        this.token = token;
        this.expirationTime = expirationTime;
        this.username = username;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public long getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(long expirationTime) {
        this.expirationTime = expirationTime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
