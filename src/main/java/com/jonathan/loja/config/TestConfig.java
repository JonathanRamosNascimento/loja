package com.jonathan.loja.config;

import java.text.ParseException;

import com.jonathan.loja.services.DBService;
import com.jonathan.loja.services.EmailService;
import com.jonathan.loja.services.MockEmailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig {

  @Autowired
  private DBService dbService;

  @Bean
  public boolean instantiateDatabse() throws ParseException {
    dbService.instantiateTestDatabase();
    return true;
  }

  @Bean
  public EmailService emailService() {
    return new MockEmailService();
  }
}