package com.quarkus.bootcamp.nttdata.domain.mapper;

import com.quarkus.bootcamp.nttdata.domain.entity.OperationWalletD;
import com.quarkus.bootcamp.nttdata.domain.interfaces.mapper.IOperationWalletMapper;
import com.quarkus.bootcamp.nttdata.infraestructure.entity.operation.OperationWallet;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class OperationWalletMapper implements IOperationWalletMapper {
  @Override
  public OperationWalletD toDto(OperationWallet operation) {
    OperationWalletD operationD = new OperationWalletD();
    //operationD.setId(operation.getId());
    operationD.setAmount(operation.getAmount());
    operationD.setOriginPhone(operation.getOriginPhone());
    operationD.setDestinationPhone(operation.getDestinationPhone());
    operationD.setDescription(operation.getDescription());
    operationD.setDate(operation.getDate());
    operationD.setDeleted(operation.getDeleted());
    return operationD;
  }

  @Override
  public OperationWallet toEntity(OperationWalletD operationD) {
    OperationWallet operation = new OperationWallet();
    //operation.setId(operationD.getId());
    operationD.setAmount(operation.getAmount());
    operationD.setOriginPhone(operation.getOriginPhone());
    operationD.setDestinationPhone(operation.getDestinationPhone());
    operationD.setDate(operation.getDate());
    operationD.setDeleted(operation.getDeleted());
    // operation.setOperationTypeId(operationD.getOperationTypeD().id);
    return operation;
  }
}
