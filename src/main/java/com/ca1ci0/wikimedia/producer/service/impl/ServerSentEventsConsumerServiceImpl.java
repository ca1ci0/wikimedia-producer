package com.ca1ci0.wikimedia.producer.service.impl;

import com.ca1ci0.wikimedia.producer.service.ServerSentEventsConsumerService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.codec.ServerSentEvent;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@Service
public class ServerSentEventsConsumerServiceImpl implements ServerSentEventsConsumerService {

  private final WebClient webClient;

  public Flux<ServerSentEvent<String>> consume(String uri) {
    return webClient
        .get()
        .uri(uri)
        .retrieve()
        .bodyToFlux(new ParameterizedTypeReference<>() {
        });
  }
}
