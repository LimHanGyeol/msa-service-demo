package com.tommy.accounts;

import com.tommy.accounts.vo.Greeting;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/")
public class HealthCheckController {

    private final Greeting greeting;

    @GetMapping("/health_check")
    public String healthCheck() {
        return "It's Working in Accounts Service";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return greeting.getMessage();
    }
}
