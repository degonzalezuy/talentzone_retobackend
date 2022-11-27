package co.com.sofka.services;

import co.com.sofka.dto.CyclistDto;
import co.com.sofka.model.CyclistModel;
import co.com.sofka.repository.CyclistRepository;
import co.com.sofka.utils.AppUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CyclistService {

    @Autowired
    private CyclistRepository cyclistRepository;
    public Flux<CyclistDto> findAll(){
        return cyclistRepository.findAll().map(AppUtils::cyclistModelToDto);
    }

    public Mono<CyclistDto> getCyclist(String id){
        return cyclistRepository.findById(id).map(AppUtils::cyclistModelToDto);
    }

    public Flux<CyclistDto>findCyclistsByCountry(String country){
        return cyclistRepository.findAll().filter(cyclist -> cyclist
                .getCountry().equals(country))
                .map(AppUtils::cyclistModelToDto);
    }

    public Mono<CyclistDto> save(CyclistDto cyclistDto){
        CyclistModel cyclistModel = AppUtils.cyclistDtoToModel(cyclistDto);
        return cyclistRepository.save(cyclistModel)
                .map(AppUtils::cyclistModelToDto);
    }

    public Mono<Void> deleteCyclist(String id){
        return cyclistRepository.deleteById(id);
    }

    public Mono<CyclistDto> update(Mono<CyclistDto> cyclistDtoMono, String id){
        return cyclistRepository.findById(id)
                .flatMap(cyclist -> cyclistDtoMono.map(AppUtils::cyclistDtoToModel)
                        .doOnNext(e->e.setId(id)))
                        .flatMap(cyclistRepository::save)
                        .map(AppUtils::cyclistModelToDto);
    }

    public Mono<Long> countOfCyclist(){
        return cyclistRepository.findAll().count();
    }
}
