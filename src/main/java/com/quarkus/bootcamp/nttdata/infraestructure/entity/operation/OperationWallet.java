package com.quarkus.bootcamp.nttdata.infraestructure.entity.operation;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@NoArgsConstructor
public class OperationWallet {
  protected Long id;
  protected double amount;
  protected String originPhone;
  protected String destinationPhone;
  protected String description;
  protected LocalDate date = LocalDate.now();
  protected String deleted = "0";
}
