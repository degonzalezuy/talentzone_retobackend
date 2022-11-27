package co.com.sofka.services;

import co.com.sofka.dto.CountryDto;
import co.com.sofka.repository.CountryRepository;
import co.com.sofka.utils.AppUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CountryService{

    @Autowired
    private CountryRepository repo;

    public Flux<CountryDto> getCountries(){
        return repo.findAll().map(AppUtils::countryEntityToDto);
    }

    public Mono<CountryDto> getCountry(String id){
        return repo.findById(id).map(AppUtils::countryEntityToDto);
    }
    public Mono<CountryDto> save(CountryDto countryDTO) {
        return null;
    }

    public Mono<CountryDto> saveCountry(Mono<CountryDto> countryDtoMono){
        return countryDtoMono.map(AppUtils::countryDtoToModel)
                .flatMap(repo::insert)
                .map(AppUtils::countryEntityToDto);
    }

    public Mono<CountryDto> updateCountry(Mono<CountryDto> countryDtoMono, String id){
        return repo.findById(id)
                .flatMap(c -> countryDtoMono.map(AppUtils::countryDtoToModel)
                        .doOnNext(e->e.setId(id)))
                .flatMap(repo::save)
                .map(AppUtils::countryEntityToDto);
    }

    public Mono<Void> deleteCountry(String id){
        return repo.deleteById(id);
    }


}
