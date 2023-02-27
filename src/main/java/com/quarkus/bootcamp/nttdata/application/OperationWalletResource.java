package com.quarkus.bootcamp.nttdata.application;

import com.quarkus.bootcamp.nttdata.domain.services.OperationWalletService;
import com.quarkus.bootcamp.nttdata.infraestructure.entity.operation.OperationWallet;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/operationwallet")
public class OperationWalletResource {
  @Inject
  OperationWalletService service;

  @POST
  @Path("/pay")
  @Transactional
  public Response pay(OperationWallet operation) {
    return Response.ok(service.pay(operation)).status(201).build();
  }

}
