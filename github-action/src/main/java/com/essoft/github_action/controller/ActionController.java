package com.essoft.github_action.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/action")
public class ActionController {

    @GetMapping
    public ResponseEntity<String> getAction() {
        return new ResponseEntity<>("Github Action Version:2.0.0", HttpStatus.OK);
    }

}
