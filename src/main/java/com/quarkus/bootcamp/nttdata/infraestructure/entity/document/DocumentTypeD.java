package com.quarkus.bootcamp.nttdata.infraestructure.entity.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DocumentTypeD {
  protected Long id;
  protected String description;
}
