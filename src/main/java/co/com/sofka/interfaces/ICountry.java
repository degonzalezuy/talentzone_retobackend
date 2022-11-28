package co.com.sofka.interfaces;

import co.com.sofka.dto.CountryDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ICountry {
    public Flux<CountryDto> getCountries();
    public Mono<CountryDto> getCountry(String id);
    public Mono<CountryDto> saveCountry(CountryDto countryDto);
    public Mono<CountryDto> updateCountry(Mono<CountryDto> countryDto, String id);
    public Mono<Void> deleteCountry(String id);

}
