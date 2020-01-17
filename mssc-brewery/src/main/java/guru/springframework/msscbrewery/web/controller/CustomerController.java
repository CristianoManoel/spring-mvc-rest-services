package guru.springframework.msscbrewery.web.controller;

import guru.springframework.msscbrewery.services.CustomerService;
import guru.springframework.msscbrewery.web.model.CustomerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/customer")

public class CustomerController {
	private final CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}

	@GetMapping({"/{customerId}"})
	public ResponseEntity<CustomerDto> getCostumer(@PathVariable("customerId") UUID customerId)
	{
		return new ResponseEntity<>(customerService.getCostumerById(customerId), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity createCustomer(@RequestBody CustomerDto customerDto)
	{
		CustomerDto savedCustomerDto = customerService.saveCustomer(customerDto);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("Location", "api/v1/customer/"+savedCustomerDto.getId().toString());
		return new ResponseEntity(httpHeaders, HttpStatus.CREATED);
	}

	@PutMapping("/{customerId}")
	public ResponseEntity updateCustomer(@PathVariable("customerId") UUID customerId, @RequestBody CustomerDto customerDto)
	{
		customerService.updateCustomer(customerId, customerDto);
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}

	@DeleteMapping("/{customerId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteCustomer(@PathVariable("customerId") UUID customerId)
	{
		customerService.deleteCustomer(customerId);
	}
}
