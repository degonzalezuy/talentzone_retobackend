package co.com.sofka.services;

import co.com.sofka.dto.CyclistDto;
import co.com.sofka.interfaces.ICyclist;
import co.com.sofka.model.CyclistModel;
import co.com.sofka.repository.CyclistRepository;
import co.com.sofka.utils.AppUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CyclistService implements ICyclist {

    @Autowired
    private CyclistRepository cyclistRepository;
    @Override
    public Flux<CyclistDto> findAll(){
        return cyclistRepository.findAll().map(AppUtils::cyclistModelToDto);
    }

    @Override
    public Mono<CyclistDto> getCyclist(String id){
        return cyclistRepository.findById(id).map(AppUtils::cyclistModelToDto);
    }

    @Override
    public Flux<CyclistDto>findCyclistsByCountry(String country){
        return cyclistRepository.findAll().filter(cyclist -> cyclist
                .getCountry().equals(country))
                .map(AppUtils::cyclistModelToDto);
    }

    @Override
    public Mono<CyclistDto> saveCyclist(CyclistDto cyclistDto){
        CyclistModel cyclistModel = AppUtils.cyclistDtoToModel(cyclistDto);
        return cyclistRepository.save(cyclistModel)
                .map(AppUtils::cyclistModelToDto);
    }

    @Override
    public Mono<Void> deleteCyclist(String id){
        return cyclistRepository.deleteById(id);
    }

    @Override
    public Mono<CyclistDto> updateCyclist(Mono<CyclistDto> cyclistDtoMono, String id){
        return cyclistRepository.findById(id)
                .flatMap(cyclist -> cyclistDtoMono.map(AppUtils::cyclistDtoToModel)
                        .doOnNext(e->e.setId(id)))
                        .flatMap(cyclistRepository::save)
                        .map(AppUtils::cyclistModelToDto);
    }

    @Override
    public Mono<Long> countOfCyclist(){
        return cyclistRepository.findAll().count();
    }
}
