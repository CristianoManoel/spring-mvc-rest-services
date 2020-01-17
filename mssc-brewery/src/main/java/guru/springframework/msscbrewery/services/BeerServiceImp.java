package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImp implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto
                .builder()
                .id(UUID.randomUUID())
                .beerName("Bavarian")
                .beerStyle("IPA")
                .upc(10l)
                .build();
    }

    @Override
    public BeerDto saveBeer(BeerDto beerDto) {
        return BeerDto
                .builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto)
    {
        log.debug("Beer Id: "+beerId.toString()+" updated with success!");
    }

    @Override
    public void deleteBeer(UUID beerId)
    {
        log.debug("Beer Id: "+beerId.toString()+" deleted with success!");
    }
}
