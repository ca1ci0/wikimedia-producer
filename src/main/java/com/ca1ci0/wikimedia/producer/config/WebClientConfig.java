package com.ca1ci0.wikimedia.producer.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

  @Bean
  WebClient webClient(WebClient.Builder webClientBuilder, @Value("${wikimedia.sse.host}") String wikimediaSseHost) {
    return webClientBuilder.baseUrl(wikimediaSseHost)
        .build();
  }
}
