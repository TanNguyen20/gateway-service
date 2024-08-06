package vn.tannguyen.gateway_service.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/dataServiceFallback")
    public String dataServiceFallback() {
        return "Data service is currently unavailable. Please try again later.";
    }

    @GetMapping("/analyticsServiceFallback")
    public String analyticsServiceFallback() {
        return "Analytics service is currently unavailable. Please try again later.";
    }
}