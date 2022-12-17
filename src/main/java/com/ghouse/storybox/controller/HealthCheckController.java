package com.ghouse.storybox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ghouse.storybox.config.ConfigUtil;

@RestController
public class HealthCheckController {
	
	@Autowired
	private ConfigUtil configUtil;

    @GetMapping("/health")
    public ResponseEntity<String> checkHealth() {
    
        return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
    }
    
    @GetMapping("/env-check")
    public ResponseEntity<String> envCheck(@RequestParam String envKey) {
    
    	String envValue = configUtil.getProperty(envKey);
    			
        return new ResponseEntity<>(envValue, HttpStatus.OK);
    }

 

}
