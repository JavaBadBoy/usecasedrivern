package com.mousa.usecasedriven.customer;

import com.mousa.usecasedriven.adapters.DomainModel;
import com.mousa.usecasedriven.adapters.Gateway;
import com.mousa.usecasedriven.customers.CustomerModelViewBuilder;

import java.util.HashMap;
import java.util.Map;

public class InMemoryEntityGateway implements Gateway {

    public Map<String,Object> store = new HashMap<String, Object>();

    public void save(DomainModel customer) {
        CustomerModelViewBuilder builder = new CustomerModelViewBuilder();
        customer.view(builder);
        store.put(builder.build().customerName,builder.build());
    }
}
