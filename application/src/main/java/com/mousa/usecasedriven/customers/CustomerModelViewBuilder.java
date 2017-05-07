package com.mousa.usecasedriven.customers;

import com.mousa.usecasedriven.adapters.ViewBuilder;

public class CustomerModelViewBuilder implements ViewBuilder<CustomerModelView> {

    private final CustomerModelView customerModelView = new CustomerModelView();

    public CustomerModelView build() {
        return customerModelView;
    }

    public ViewBuilder withCustomerName(String customerName) {
        customerModelView.customerName=customerName;
        return this;
    }
}
