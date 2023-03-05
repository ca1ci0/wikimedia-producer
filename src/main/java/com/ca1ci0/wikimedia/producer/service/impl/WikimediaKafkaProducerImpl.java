package com.ca1ci0.wikimedia.producer.service.impl;

import com.ca1ci0.wikimedia.producer.service.WikimediaKafkaProducer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class WikimediaKafkaProducerImpl implements WikimediaKafkaProducer {

  private final KafkaTemplate<String, String> kafkaTemplate;

  @Override
  public void produce(String topic, String msg) {
    log.info("Sending message(length={}) to {} topic", msg.length(), topic);
    kafkaTemplate.send(topic, msg);
  }
}
