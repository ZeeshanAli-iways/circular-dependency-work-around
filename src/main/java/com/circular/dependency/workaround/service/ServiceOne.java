package com.circular.dependency.workaround.service;

import javax.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service one. Used {@link ServiceTwo} as dependency
 */
@Service
@Slf4j
public class ServiceOne {

  ServiceTwo serviceTwo;

  @Autowired
  public ServiceOne(ServiceTwo serviceTwo) {
    this.serviceTwo = serviceTwo;
  }

  @PostConstruct
  public void init() {
    log.info("{} started", this.getClass().getName());
  }

}
