package edu.miu.cs.cs425.fairfieldlibrarywebapi.advice;

import edu.miu.cs.cs425.fairfieldlibrarywebapi.exception.PublisherNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class FairfieldLibraryWebAPIExceptionHandler {

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(PublisherNotFoundException.class)
    public Map<String, String> handleWebAPIException(PublisherNotFoundException publisherNotFoundException) {
        Map<String, String> errorMap = new HashMap<>();
        errorMap.put("errorMessage", publisherNotFoundException.getMessage());
        return errorMap;
    }

}
