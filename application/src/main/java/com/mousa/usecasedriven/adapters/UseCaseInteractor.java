package com.mousa.usecasedriven.adapters;

import com.mousa.usecasedriven.customers.CreateCustomerOutputPort;

public interface UseCaseInteractor<I extends UseCaseBoundary, O extends UseCaseBoundary> {
    public CreateCustomerOutputPort execute(I input);
}
