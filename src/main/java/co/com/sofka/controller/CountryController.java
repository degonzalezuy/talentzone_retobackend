package co.com.sofka.controller;

import co.com.sofka.dto.CountryDto;
import co.com.sofka.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService service;

    /***
     * Get for url localhost:8080/countries
     * @return Response Entity with all countries
     */
    @GetMapping
    public ResponseEntity<Flux<CountryDto>> getCountries(){
        return ResponseEntity.ok().body(service.getCountries());
    }

    /***
     * Get for url localhost:8080/countries/{id}
     * @param id type="String"
     * @return Response Entity with Country with id=param
     */
    @GetMapping("/{id}")
    public Mono<CountryDto> getCountry(@PathVariable String id){
        return service.getCountry(id);
    }

    /***
     * Post for url localhost:8080/countries
     * @param countryDto
     * @return Response Entity with Country saved
     */
    @PostMapping
    public ResponseEntity<Mono<CountryDto>> saveCountry(@RequestBody CountryDto countryDto){
        return ResponseEntity.ok().body(service.saveCountry(countryDto));
    }

    /***
     * Put for url localhost:8080/countries
     * @param countryDtoMono
     * @param id
     * @return Response Entity with Country updated
     */
    @PutMapping("/{id}")
    public ResponseEntity<Mono<CountryDto>> updateCountry(@RequestBody Mono<CountryDto> countryDtoMono, @PathVariable String id){
        return ResponseEntity.ok()
                .body(service.updateCountry(countryDtoMono, id));
    }

    /***
     * Delete for url localhost:8080/countries
     * @param id
     * @return Void
     */
    @DeleteMapping("/{id}")
    public Mono<ResponseEntity<Void>> deleteCountry(@PathVariable String id){
        return service.deleteCountry(id)
                .then(Mono.just(new ResponseEntity<Void>(HttpStatus.NO_CONTENT)))
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }
}
