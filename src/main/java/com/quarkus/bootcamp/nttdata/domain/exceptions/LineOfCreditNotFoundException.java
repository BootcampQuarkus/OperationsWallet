package com.quarkus.bootcamp.nttdata.domain.exceptions;

public class LineOfCreditNotFoundException extends Exception {
  public LineOfCreditNotFoundException(String errorMessage) {
    super(errorMessage);
  }
}
