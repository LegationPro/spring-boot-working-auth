package com.example.backend01.service;

import com.example.backend01.dao.request.SignInRequest;
import com.example.backend01.dao.request.SignUpRequest;
import com.example.backend01.dao.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signUp(SignUpRequest request);
    JwtAuthenticationResponse signIn(SignInRequest request);
}
