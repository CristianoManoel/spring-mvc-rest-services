package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
	CustomerDto getCostumerById(UUID id);

	CustomerDto saveCustomer(CustomerDto customerDto);

	void updateCustomer(UUID customerId, CustomerDto customerDto);

	void deleteCustomer(UUID customerId);
}
