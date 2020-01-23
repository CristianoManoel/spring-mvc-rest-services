package guru.springframework.msscbreweryclient.web.client;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import guru.springframework.msscbreweryclient.web.model.BeerDto;

import java.net.URI;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BreweryClientTest {
	@Autowired
	BreweryClient client;

	@Test
	void getBeerById() {
		//Arrange
		BeerDto beerDto;
		UUID id = UUID.randomUUID();
		// Act
		beerDto = client.getBeerById(id);

		// Assert
		assertNotNull(beerDto);
	}

	@Test
	void createBeer() {
		//Arrange
		BeerDto beerDto = BeerDto.builder().build();

		// Act
		URI uri = client.createBeer(beerDto);

		// Assert
		assertNotNull(uri.getPath());

	}

	@Test
	void updateBeer() {
		//Arrange
		BeerDto beerDto = BeerDto.builder().build();
		UUID id = UUID.randomUUID();

		// Act
		client.updateBeer(id, beerDto);

	}

	@Test
	void deleteBeer() {
		//Arrange
		UUID id = UUID.randomUUID();

		// Act
		client.deleteBeer(id);

	}
}