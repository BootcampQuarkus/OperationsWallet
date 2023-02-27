package com.quarkus.bootcamp.nttdata.domain.entity;

import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@MongoEntity(collection = "operationwallet")
public class OperationWalletD {
    
    protected ObjectId id;
    protected double amount;
    protected String originPhone;
    protected String destinationPhone;
    protected String description;
    protected LocalDate date = LocalDate.now();
    protected String deleted = "0";
}
