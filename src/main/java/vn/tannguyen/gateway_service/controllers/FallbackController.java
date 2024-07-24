package vn.tannguyen.gateway_service.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/dataServiceFallback")
    public String movieServiceFallback() {
        return "Data service is currently unavailable. Please try again later.";
    }
}