package co.com.sofka.controller;

import co.com.sofka.dto.CyclistDto;
import co.com.sofka.services.CyclistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/cyclists")
public class CyclistsController {

    @Autowired
    private CyclistService service;

    /***
     *
     * @return
     */
    @GetMapping
    public ResponseEntity<Flux<CyclistDto>> getCyclists(){
        return ResponseEntity.ok().body(service.findAll());
    }

    /***
     *
     * @param country
     * @return
     */
    @GetMapping("/country/{country}")
    public ResponseEntity<Flux<CyclistDto>> findCyclistsByCountry(@PathVariable(value="country")String country){
        return ResponseEntity.ok().body(service.findCyclistsByCountry(country));
    }

    /***
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public ResponseEntity<Mono<CyclistDto>> findCyclistById(@PathVariable String id){
        return ResponseEntity.ok().body(service.getCyclist(id));
    }

    /***
     *
     * @param cyclistDto
     * @return
     */
    @PostMapping()
    public ResponseEntity<Mono<CyclistDto>> save(@RequestBody CyclistDto cyclistDto){
        return ResponseEntity.ok().body(service.save(cyclistDto));
    }

    /***
     *
     * @param cyclistDtoMono
     * @param id
     * @return
     */
    @PutMapping("/{id}")
    public ResponseEntity<Mono<CyclistDto>>updateCyclist(@RequestBody Mono<CyclistDto> cyclistDtoMono, @PathVariable String id){
        return ResponseEntity.ok()
                .body(service.update(cyclistDtoMono, id));
    }

    /***
     *
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public Mono<ResponseEntity<Void>> delete(@PathVariable("id") String id){
        return service.deleteCyclist(id)
                .then(Mono.just(new ResponseEntity<Void>(HttpStatus.NO_CONTENT)))
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }
}

