package com.kutay.springboot.core.exceptionHandler.entity;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public class CustomException extends RuntimeException {
    private final HttpStatus httpStatus;
    private final LocalDateTime timestamp;

    public CustomException(String message, Throwable throwable, HttpStatus httpStatus, LocalDateTime timestamp) {
        super(message, throwable);
        this.httpStatus = httpStatus;
        this.timestamp = timestamp;
    }
}
