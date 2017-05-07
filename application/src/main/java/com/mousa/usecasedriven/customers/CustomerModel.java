package com.mousa.usecasedriven.customers;

import com.mousa.usecasedriven.adapters.DomainModel;
import com.mousa.usecasedriven.adapters.ViewBuilder;

public class CustomerModel implements DomainModel<CustomerModelViewBuilder> {
    private String customerName;

    public CustomerModel(String customerName) {

        this.customerName = customerName;
    }


    public void view(CustomerModelViewBuilder builder) {
        builder.withCustomerName(this.customerName);
    }
}
