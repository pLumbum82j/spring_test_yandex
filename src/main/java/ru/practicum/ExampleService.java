package ru.practicum;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ExampleService {

    public int sum(int a, int b) {
        log.info("Got a={}, b={}", a, b);
        return a + b;
    }
}