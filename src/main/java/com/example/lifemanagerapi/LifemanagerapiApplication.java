package com.example.lifemanagerapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath*:application-context.xml"})
public class LifemanagerapiApplication {

  public static void main(String[] args) {
    SpringApplication.run(LifemanagerapiApplication.class, args);
  }

}
