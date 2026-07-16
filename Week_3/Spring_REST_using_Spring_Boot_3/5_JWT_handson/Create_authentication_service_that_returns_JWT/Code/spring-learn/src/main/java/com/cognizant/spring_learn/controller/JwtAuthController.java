package com.cognizant.spring_learn.controller;

import java.util.Base64;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.jwt.JwtTokenProvider;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class JwtAuthController {

    private final JwtTokenProvider jwtTokenProvider;

    public JwtAuthController(JwtTokenProvider jwtTokenProvider) {
        this.jwtTokenProvider = jwtTokenProvider;
    }

    @GetMapping("/authenticate")
    public ResponseEntity<?> generateAuthToken(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");

        if (authHeader != null && authHeader.startsWith("Basic ")) {
            String base64Credentials = authHeader.substring("Basic ".length());
            String credentials = new String(Base64.getDecoder().decode(base64Credentials));
            String[] values = credentials.split(":", 2);

            String username = values[0];
            String password = values[1];

            if ("user".equals(username) && "pwd".equals(password)) {
                String token = jwtTokenProvider.createToken(username);
                return ResponseEntity.ok(Map.of("token", token));
            }
        }

        return ResponseEntity.status(401).body("Unauthorized");
    }

}