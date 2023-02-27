package com.quarkus.bootcamp.nttdata.infraestructure.entity.address;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CityD {
  protected Long id;
  protected String name;
  protected Long stateId;
}
