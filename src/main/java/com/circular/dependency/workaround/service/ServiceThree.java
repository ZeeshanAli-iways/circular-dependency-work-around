package com.circular.dependency.workaround.service;

import javax.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * Service three. Has {@link ServiceTwo} dependency
 */
@Service
@Slf4j
public class ServiceThree {

  ServiceTwo serviceTwo;

  @Autowired
  public void setServiceTwo(@Lazy ServiceTwo serviceTwo) {
    this.serviceTwo = serviceTwo;
  }

  @PostConstruct
  public void init() {
    log.info("{} started", this.getClass().getName());
  }
}
