package com.example.a;

import com.example.b.SystemB;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class SystemA {
  private static final Logger logger = LoggerFactory.getLogger(SystemA.class);
  private final SystemB systemB;

  @Autowired
  public SystemA(SystemB systemB) {
    this.systemB = systemB;
  }

  @PostConstruct
  public void start() {
    logger.info("Hello " + systemB.getValue());
  }
}
