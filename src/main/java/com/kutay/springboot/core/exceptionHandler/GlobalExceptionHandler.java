package com.kutay.springboot.core.exceptionHandler;

import com.kutay.springboot.core.exceptionHandler.entity.CustomException;
import com.kutay.springboot.core.utily.results.ErrorDataResult;
import org.jetbrains.annotations.NotNull;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Object handleValidationRequestError(@NotNull MethodArgumentNotValidException validationErrors){
        Map<String, String> validationErrorMaps = new HashMap<>();
        for (FieldError fieldError: validationErrors.getFieldErrors()) {
            validationErrorMaps.put(fieldError.getField(), fieldError.getDefaultMessage());
        }
        ErrorDataResult<Map<String, String>> errorDataResult = new ErrorDataResult<>(validationErrorMaps, "Request is not valid");
        return new ResponseEntity<>(errorDataResult, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NoSuchElementException.class)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Object handleNoValuePresentError(@NotNull NoSuchElementException error){
        ErrorDataResult<CustomException> errorDataResult = new ErrorDataResult<>(new CustomException(error.getMessage(), error, HttpStatus.BAD_REQUEST, LocalDateTime.now()), error.getMessage());
        return new ResponseEntity<>(errorDataResult, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(InvalidDataAccessApiUsageException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Object handleInvalidDataAccessApiUsageExceptionError(@NotNull InvalidDataAccessApiUsageException error){
        ErrorDataResult<CustomException> errorDataResult = new ErrorDataResult<>(new CustomException(error.getMessage(), error, HttpStatus.BAD_REQUEST, LocalDateTime.now()), error.getMessage());
        return new ResponseEntity<>(errorDataResult, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Object handleIllegalArgumentExceptionError(@NotNull IllegalArgumentException error){
        ErrorDataResult<CustomException> errorDataResult = new ErrorDataResult<>(new CustomException(error.getMessage(), error, HttpStatus.BAD_REQUEST, LocalDateTime.now()),error.getMessage());
        return new ResponseEntity<>(errorDataResult, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(IllegalStateException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Object handleIllegalStateExceptionError(@NotNull IllegalStateException error){
        ErrorDataResult<CustomException> errorDataResult = new ErrorDataResult<>(new CustomException(error.getMessage(), error, HttpStatus.BAD_REQUEST, LocalDateTime.now()),error.getMessage());
        return new ResponseEntity<>(errorDataResult, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(InvocationTargetException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Object handleInvocationTargetExceptionError(@NotNull InvocationTargetException error){
        ErrorDataResult<CustomException> errorDataResult = new ErrorDataResult<>(new CustomException(error.getMessage(), error, HttpStatus.BAD_REQUEST, LocalDateTime.now()),error.getMessage());
        return new ResponseEntity<>(errorDataResult, HttpStatus.BAD_REQUEST);
    }

}
