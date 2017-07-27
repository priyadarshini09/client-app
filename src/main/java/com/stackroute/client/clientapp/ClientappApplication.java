package com.stackroute.client.clientapp;

import java.security.Principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class ClientappApplication {
	
	//private final static Logger logger = LoggerFactory.getLogger(ClientappApplication.class);

  @RequestMapping("/")
  public String home(Principal user) {
    return "Hello " + user.getName();
  }

  public static void main(String[] args) {
	  //logger.debug("inside main");
     SpringApplication.run(ClientappApplication.class, args);
  }

}
