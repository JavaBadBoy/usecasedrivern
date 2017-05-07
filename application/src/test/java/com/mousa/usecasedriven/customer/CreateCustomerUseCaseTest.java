package com.mousa.usecasedriven.customer;


import com.mousa.usecasedriven.adapters.Gateway;
import com.mousa.usecasedriven.customers.CreateCustomerInputPort;
import com.mousa.usecasedriven.customers.CreateCustomerOutputPort;
import com.mousa.usecasedriven.customers.CreateCustomerUCInteractor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CreateCustomerUseCaseTest {

    private CreateCustomerInputPort input;
    private Gateway gateway = new InMemoryEntityGateway();

    @Before
    public void setUp() throws Exception {
        input = new CreateCustomerInputPort();
    }

    @Test
    public void canExecuteCreateCustomerUseCase() {
        new CreateCustomerUCInteractor(gateway).execute(input);
    }

    @Test
    public void givenCreateCustomerInpotPortWithCustomerNameMousa_thenExecuteShouldPersistCustomerWithNameMousa() {
        input.customerName = "Mousa";
        CreateCustomerOutputPort output = new CreateCustomerUCInteractor(gateway).execute(input);
    }
}
