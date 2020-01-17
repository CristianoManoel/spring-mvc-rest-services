package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDto;
import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImp implements CustomerService
{
	@Override
	public CustomerDto getCostumerById(UUID id) {
		return CustomerDto
				.builder()
				.id(UUID.randomUUID())
				.name("Cristiano")
				.build();
	}

	@Override
	public CustomerDto saveCustomer(CustomerDto customerDto)
	{
		return CustomerDto
				.builder()
				.id(UUID.randomUUID())
				.build();
	}

	@Override
	public void updateCustomer(UUID customerId, CustomerDto customerDto)
	{
		log.debug("Customer Id: "+customerId.toString()+" updated with success!");
	}

	@Override
	public void deleteCustomer(UUID customerId)
	{
		log.debug("Customer Id: "+customerId.toString()+" deleted with success!");
	}
}
