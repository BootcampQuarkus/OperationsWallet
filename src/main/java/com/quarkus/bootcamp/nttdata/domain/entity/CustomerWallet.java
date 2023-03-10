package com.quarkus.bootcamp.nttdata.domain.entity;

import com.quarkus.bootcamp.nttdata.infraestructure.entity.address.AddressD;
import com.quarkus.bootcamp.nttdata.infraestructure.entity.document.DocumentD;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerWallet {
  protected ObjectId id;
  protected String user;
  protected String cellphone;
  protected String password;
  protected double amount;
  protected String fullName;
  protected Long addressId;
  protected Long documentId;
  protected DocumentD document;
  protected AddressD address;
  protected Long cardId;
}
