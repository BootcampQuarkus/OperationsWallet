package com.quarkus.bootcamp.nttdata.domain.services;

import com.quarkus.bootcamp.nttdata.domain.entity.CustomerWallet;
import com.quarkus.bootcamp.nttdata.domain.mapper.OperationWalletMapper;
import com.quarkus.bootcamp.nttdata.infraestructure.entity.customerWallet.CustomerD;
import com.quarkus.bootcamp.nttdata.infraestructure.entity.operation.OperationWallet;
import com.quarkus.bootcamp.nttdata.infraestructure.repository.OperationWalletRepository;
import com.quarkus.bootcamp.nttdata.infraestructure.resources.ICustomerWalletApi;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.NotFoundException;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@ApplicationScoped
public class OperationWalletService {

  private static Logger LOG = LoggerFactory.getLogger(OperationWalletService.class);

  @Inject
  OperationWalletRepository repository;

  @Inject
  OperationWalletMapper mapper;

  @RestClient
  ICustomerWalletApi customerWalletApi;

  public Uni<List<CustomerD>> pay(OperationWallet operation) {
    // 1.- Validar si es CellPhone a Cellphone
    if (!(operation.getOriginPhone() != null && operation.getDestinationPhone() != null)) {
      throw new NotFoundException("Error de cellphones");
    }
    return customerWalletApi.getAll();
    // Validar que exista el celular de origen
    // return customerWalletApi.viewCustomerByCellphone(operation.getOriginPhone()).flatMap(p -> Uni.createFrom().item(p.getId()));

    // Validar que el usuario de origen tenga monto suficiente para la operacion

    // Validar que exista el celular de destino

    // Actualizar monto de cuenta origen
    // Actualizar monto de cuenta destino


    // 2. Validar si es Cellphone a account
    // 3. Validar si es de Account a cellphone
    // 4. Validar si es de Account a account


    //OperationWalletD operationD = mapper.toDto(operation);
    //try {
//        if (!operation.getDescription().equals("Pay")) {//Validar que la descripcion sea pago de wallet
//            throw new NotFoundException("user wallet not found");
//        }
//        Uni<OperationWallet> a = null;
//        Uni<CustomerWallet> customerWalletO = customerWalletApi.getById("63f93f218d408c66c8bef862");


    //Buscar customer wallet con numero de telefono -> origen
    //Uni<CustomerWallet> customerWalletO = customerWalletApi.viewCustomerByCellphone(operation.getOriginPhone());
        /*return customerWalletO.flatMap(custO -> {
            if (custO == null) {
                throw new NotFoundException("user wallet not found");
            }*/
            /*if (custO.getCardId() == null || custO.getCardId().equals("")) {//Validar si  no tiene cuenta bancaria
                Amount amount = new Amount();
                amount.setAmount(operation.getAmount());
                amount.setOperation("Discount");
                customerWalletApi.updateAmount(custO.getId().toString(), amount);//Actualizar monto Origen
            } else {
                //Actualizar Amount en cuenta bancaria origen
            }*/
                    /*
                    Uni<CustomerWallet> customerWalletD = customerWalletApi.viewCustomerByCellphone(operation.getDestinationPhone())
                            .onItem().transform(custD -> {
                                if (custD == null) {
                                    throw new NotFoundException("user wallet not found");
                                }
                                if (custD.getCardId() == null || custD.getCardId().equals("")) {//Validar si  no tiene cuenta bancaria destino
                                    Amount amount = new Amount();
                                    amount.setAmount(operation.getAmount());
                                    amount.setOperation("Compensation");
                                    customerWalletApi.updateAmount(custD.getId(), amount);//Actualizar monto destino
                                } else {
                                    //Actualizar Amount en cuenta bancaria
                                }
                                return custD;
                            }); */
    //return custO;
//            return a;
    //});
       /*} catch (Exception e) {
            throw new RuntimeException(e);
        }*/
    //return customerWalletO;
  }
}

