package com.wallet.management.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * A dummy controller to check the health of the application
 *
 * @author Saivarma Akarapu
 */
@RestController
@RequestMapping("/health")
public class HealthController {

    /**
     * API that returns a static message which shows whether the app is running successfully or not
     * @return String that shows status of application
     */
    @GetMapping("/checkHealth")
    public ResponseEntity<String> checkApplicationHealth() {
        return ResponseEntity.ok("Application is up and running");
    }

}
