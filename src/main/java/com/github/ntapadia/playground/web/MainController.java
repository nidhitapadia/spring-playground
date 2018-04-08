package com.github.ntapadia.playground.web;

import com.github.ntapadia.playground.domain.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api")
public class MainController {

    @GetMapping("/messages")
    public Flux<Message> allMessages() {
        return Flux.just(new Message("Hello"), new Message("World"));
    }
}
