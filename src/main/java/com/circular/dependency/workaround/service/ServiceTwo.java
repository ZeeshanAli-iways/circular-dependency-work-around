package com.circular.dependency.workaround.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Service two. Has {@link ServiceOne} and {@link ServiceThree} dependency
 */
@Service
@Slf4j
public class ServiceTwo {

  ServiceOne serviceOne;
  ServiceThree serviceThree;

  @Autowired
  public ServiceTwo(@Lazy ServiceOne serviceOne, ServiceThree serviceThree) {
    this.serviceOne = serviceOne;
    this.serviceThree = serviceThree;
  }

  @PostConstruct
  public void init() {
    log.info("{} started",this.getClass().getName());
  }
}
