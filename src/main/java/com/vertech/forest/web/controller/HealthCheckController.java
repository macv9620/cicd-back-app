package com.vertech.forest.web.controller;

import com.vertech.forest.persistence.entity.QueryEntity;
import com.vertech.forest.web.controller.wrapper.ResponseWrapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class HealthCheckController {

    @GetMapping
    public ResponseEntity<ResponseWrapper<?>> getAll(){

        String message = "Forest API - v.2.0.0 Auto";
        List<QueryEntity> data = null;
        HttpStatus httpStatus = HttpStatus.OK;

        ResponseWrapper<List<QueryEntity>> responseWrapper = new ResponseWrapper<>(
                message,
                data
        );

        return new ResponseEntity<>(responseWrapper, httpStatus);
    }
}
