package com.quarkus.bootcamp.nttdata.domain.exceptions;

public class CartTypeNotFoundException extends Exception {
  public CartTypeNotFoundException(String errorMessage) {
    super(errorMessage);
  }
}
