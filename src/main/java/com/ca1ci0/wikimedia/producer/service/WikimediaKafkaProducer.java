package com.ca1ci0.wikimedia.producer.service;

public interface WikimediaKafkaProducer {

  void produce(String topic, String msg);
}
