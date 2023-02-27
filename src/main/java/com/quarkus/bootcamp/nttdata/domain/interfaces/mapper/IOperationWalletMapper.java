package com.quarkus.bootcamp.nttdata.domain.interfaces.mapper;

import com.quarkus.bootcamp.nttdata.domain.entity.OperationWalletD;
import com.quarkus.bootcamp.nttdata.infraestructure.entity.operation.OperationWallet;

public interface IOperationWalletMapper {
  OperationWalletD toDto(OperationWallet operation);

  OperationWallet toEntity(OperationWalletD operationD);
}
