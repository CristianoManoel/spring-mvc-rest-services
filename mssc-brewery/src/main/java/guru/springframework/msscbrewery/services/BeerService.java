package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;


public interface BeerService {
    BeerDto getBeerById(UUID beerId);

	BeerDto saveBeer(BeerDto beerDto);

	void updateBeer(UUID beerId, BeerDto beerDto);

	void deleteBeer(UUID beerId);
}
