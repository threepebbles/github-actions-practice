package com.example.demospring;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/bye")
public class ByeController {
    @GetMapping(value = "")
    public ResponseEntity bye() {
        return ResponseEntity.ok("잘가");
    }
}