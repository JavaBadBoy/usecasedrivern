package com.mousa.usecasedriven.customers;


import com.mousa.usecasedriven.adapters.DomainModel;
import com.mousa.usecasedriven.adapters.Gateway;
import com.mousa.usecasedriven.adapters.UseCaseBoundary;
import com.mousa.usecasedriven.adapters.UseCaseInteractor;

public class CreateCustomerUCInteractor implements UseCaseInteractor<CreateCustomerInputPort,CreateCustomerOutputPort> {
    private final Gateway gateway;
    private CreateCustomerOutputPort output;

    public CreateCustomerUCInteractor(Gateway gateway) {

        this.gateway = gateway;
    }

    public CreateCustomerOutputPort execute(CreateCustomerInputPort input) {
        DomainModel customer = new CustomerModel(input.customerName);
        gateway.save(customer);
        return output;
    }


}
