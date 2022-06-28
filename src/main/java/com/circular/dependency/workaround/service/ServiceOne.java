package com.circular.dependency.workaround.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

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
    log.info("{} started",this.getClass().getName());
  }

}
