package guru.springframework.msscbrewery.services.v2;

import guru.springframework.msscbrewery.web.model.BeerDto;
import guru.springframework.msscbrewery.web.model.Enums.BeerStyle;
import guru.springframework.msscbrewery.web.model.v2.BeerDtoV2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpV2 implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2
                .builder()
                .id(UUID.randomUUID())
                .beerName("Bavarian")
                .beerStyle(BeerStyle.IPA)
                .upc(10l)
                .build();
    }

    @Override
    public BeerDtoV2 saveBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2
                .builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto)
    {
        log.debug("Beer Id: "+beerId.toString()+" updated with success!");
    }

    @Override
    public void deleteBeer(UUID beerId)
    {
        log.debug("Beer Id: "+beerId.toString()+" deleted with success!");
    }
}
