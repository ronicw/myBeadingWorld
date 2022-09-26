package com.ronicw.beadingservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
@Slf4j
public class BeadController {

    @GetMapping(value="/fluxstream", produces=MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Integer> getFluxStreamInt() {
        return Flux.range(1, 20)
                .delayElements(Duration.ofSeconds(1))
                .doOnNext(i -> log.info(String.valueOf(i)));


    }

}
