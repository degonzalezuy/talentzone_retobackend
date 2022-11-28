package co.com.sofka.interfaces;

import co.com.sofka.dto.CyclistDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ICyclist {
    public Flux<CyclistDto> findAll();
    public Mono<CyclistDto> getCyclist(String id);
    public Flux<CyclistDto>findCyclistsByCountry(String country);
    public Mono<CyclistDto> saveCyclist(CyclistDto cyclistDto);
    public Mono<Void> deleteCyclist(String id);
    public Mono<CyclistDto> updateCyclist(Mono<CyclistDto> cyclistDtoMono, String id);
    public Mono<Long> countOfCyclist();

}
