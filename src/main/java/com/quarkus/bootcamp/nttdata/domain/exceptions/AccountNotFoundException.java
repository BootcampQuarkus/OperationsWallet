package com.quarkus.bootcamp.nttdata.domain.exceptions;

public class AccountNotFoundException extends Exception {
  public AccountNotFoundException(String errorMessage) {
    super(errorMessage);
  }
}
