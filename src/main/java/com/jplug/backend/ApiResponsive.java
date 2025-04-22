package com.jplug.backend;
import java.util.List;
import java.util.ArrayList;
public class ApiResponsive {
    private String message;
    private String status;

    // Constructor
    public ApiResponsive(String message, String status) {
        this.message = message;
        this.status = status;
    }

    // Getters (required for JSON serialization)
    public String getMessage() {
        return message;
    }

    public String getStatus() {
        return status;
    }
}
