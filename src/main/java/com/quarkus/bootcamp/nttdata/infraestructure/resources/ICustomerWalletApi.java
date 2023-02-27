package com.quarkus.bootcamp.nttdata.infraestructure.resources;

import com.quarkus.bootcamp.nttdata.domain.entity.CustomerWallet;
import com.quarkus.bootcamp.nttdata.infraestructure.entity.customer.Amount;
import io.smallrye.mutiny.Uni;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.List;

@RegisterRestClient
@Path("/customerwallet")
public interface ICustomerWalletApi {

    @GET
    public Uni<List<CustomerWallet>> getAll();

    @GET
    @Path("/{id}")
    public Uni<CustomerWallet> getById(@PathParam("id") String id);

    @GET
    @Path("/cellphone/{cellphone}")
    public Uni<CustomerWallet> viewCustomerByCellphone(@PathParam("cellphone") String cellphone);

    @PUT
    @Path("/amount/{id}")
    @Transactional
    public Uni<CustomerWallet> updateAmount(@PathParam("id") String id, Amount amount);

}
