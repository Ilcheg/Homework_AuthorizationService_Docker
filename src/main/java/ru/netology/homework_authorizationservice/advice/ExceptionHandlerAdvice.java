package ru.netology.homework_authorizationservice.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.netology.homework_authorizationservice.exceptions.InvalidCredentials;
import ru.netology.homework_authorizationservice.exceptions.UnauthorizedUser;

@RestControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler
    public ResponseEntity<String> invalidCredentialsHandler(InvalidCredentials e) {
        return new ResponseEntity<>("User name or password is empty", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler
    public ResponseEntity<String> unAuthorizedUserHandler(UnauthorizedUser e) {
        System.err.println(e.getMessage());
        return new ResponseEntity<>("Unknown user", HttpStatus.UNAUTHORIZED);
    }
}
