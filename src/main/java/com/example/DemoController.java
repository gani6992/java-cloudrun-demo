package com.example;

import org.springframework.web.bind.annotation.*;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class DemoController {

    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

    @PostMapping("/")
    public String handleRequest(@RequestBody Map<String, Object> payload) {
        logger.info("Received payload: {}", payload);
        return "Payload received and logged";
    }
}
