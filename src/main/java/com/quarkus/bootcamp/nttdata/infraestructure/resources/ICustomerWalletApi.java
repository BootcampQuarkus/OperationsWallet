package com.quarkus.bootcamp.nttdata.infraestructure.resources;

import com.quarkus.bootcamp.nttdata.domain.entity.CustomerWallet;
import com.quarkus.bootcamp.nttdata.infraestructure.entity.customer.Amount;
import com.quarkus.bootcamp.nttdata.infraestructure.entity.customerWallet.CustomerD;
import io.smallrye.mutiny.Uni;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.List;

@RegisterRestClient
@Path("/customerwallet")
public interface ICustomerWalletApi {

  @GET
  @Path("/")
  Uni<List<CustomerD>> getAll();

  @GET
  @Path("/{id}")
  Uni<CustomerD> getById(@PathParam("id") String id);

  @GET
  @Path("/cellphone/{cellphone}")
  Uni<CustomerD> viewCustomerByCellphone(@PathParam("cellphone") String cellphone);

  @PUT
  @Path("/amount/{id}")
  @Transactional
  Uni<CustomerD> updateAmount(@PathParam("id") String id, Amount amount);
}