package com.ronicw.beadingservice.controller;

import com.ronicw.beadingservice.api.TechniquesApi;
import com.ronicw.beadingservice.model.Technique;
import com.ronicw.beadingservice.model.TechniquesTechniqueNameGet200Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
@Slf4j
public class BeadController implements TechniquesApi {

    @GetMapping(value="/fluxstream", produces=MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Integer> getFluxStreamInt() {
        return Flux.range(1, 20)
                .delayElements(Duration.ofSeconds(1))
                .doOnNext(i -> log.info(String.valueOf(i)));
    }


    @Override
    public Mono<ResponseEntity<Flux<Technique>>> techniquesGet(Integer limit, Integer offset, ServerWebExchange exchange) {
        return null;
    }

    @Override
    public Mono<ResponseEntity<Void>> techniquesPost(Mono<Technique> technique, ServerWebExchange exchange) {
        return null;
    }

    @Override
    public Mono<ResponseEntity<TechniquesTechniqueNameGet200Response>> techniquesTechniqueNameGet(String techniqueName, ServerWebExchange exchange) {
        return null;
    }

}
