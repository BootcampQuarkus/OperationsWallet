package com.quarkus.bootcamp.nttdata.infraestructure.entity.product;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AccountD {
  protected Long id;
  protected Double amount;
  protected Long customerId;
  protected Long cardId;
}
