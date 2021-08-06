package com.ibolya.gyakorlas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberController {
    NumberService service;

    public NumberController(@Autowired NumberService service) {
        this.service = service;
    }

    @PostMapping("increase")
    public ResponseEntity<Void> increase() {
        service.increase();
        return ResponseEntity.ok(null);
    }

    @PostMapping("decrease")
    public ResponseEntity<Void> decrease() {
        service.decrease();
        return ResponseEntity.ok(null);
    }

    @GetMapping("read")
    public ResponseEntity<Integer> read() {
        return ResponseEntity.ok(service.read());
    }


}
