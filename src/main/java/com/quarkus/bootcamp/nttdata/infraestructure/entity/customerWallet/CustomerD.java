package com.quarkus.bootcamp.nttdata.infraestructure.entity.customerWallet;

import com.quarkus.bootcamp.nttdata.infraestructure.entity.customerWallet.address.AddressD;
import com.quarkus.bootcamp.nttdata.infraestructure.entity.customerWallet.document.DocumentD;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

@Data
@NoArgsConstructor
public class CustomerD {
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
