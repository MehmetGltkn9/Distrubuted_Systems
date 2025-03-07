package com.example.distributedsystem.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public ResponseEntity<Map<String, Object>> handleError(HttpServletRequest request) {
        return ResponseEntity.ok(Map.of(
            "error", "Page not found",
            "path", request.getRequestURI(),
            "status", 404,
            "message", "The requested resource was not found"
        ));
    }
} 