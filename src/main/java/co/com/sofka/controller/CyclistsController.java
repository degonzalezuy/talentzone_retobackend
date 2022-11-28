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
     * Get for url localhost:8080/cyclists
     * @return Response Entity with all Cyclists
     */
    @GetMapping
    public ResponseEntity<Flux<CyclistDto>> getCyclists(){
        return ResponseEntity.ok().body(service.findAll());
    }

    /***
     * Get for url localhost:8080/cyclists/country
     * @param country
     * @return Response Entity with Cyclists by country
     */
    @GetMapping("/country/{country}")
    public ResponseEntity<Flux<CyclistDto>> findCyclistsByCountry(@PathVariable(value="country")String country){
        return ResponseEntity.ok().body(service.findCyclistsByCountry(country));
    }

    /***
     * Get for url localhost:8080/cyclists
     * @param id
     * @return Response Entity with cyclist find by id
     */
    @GetMapping("/{id}")
    public ResponseEntity<Mono<CyclistDto>> findCyclistById(@PathVariable String id){
        return ResponseEntity.ok().body(service.getCyclist(id));
    }

    /***
     * Post for url localhost:8080/cyclists
     * @param cyclistDto
     * @return Response Entity with Cyclist Saved
     */
    @PostMapping()
    public ResponseEntity<Mono<CyclistDto>> save(@RequestBody CyclistDto cyclistDto){
        return ResponseEntity.ok().body(service.saveCyclist(cyclistDto));
    }

    /***
     * Put for url localhost:8080/cyclists
     * @param cyclistDtoMono
     * @param id
     * @return Response Entity with Cyclist Updated
     */
    @PutMapping("/{id}")
    public ResponseEntity<Mono<CyclistDto>>updateCyclist(@RequestBody Mono<CyclistDto> cyclistDtoMono, @PathVariable String id){
        return ResponseEntity.ok()
                .body(service.updateCyclist(cyclistDtoMono, id));
    }

    /***
     * Delete for url localhost:8080/cyclists
     * @param id
     * @return Void
     */
    @DeleteMapping("/{id}")
    public Mono<ResponseEntity<Void>> delete(@PathVariable("id") String id){
        return service.deleteCyclist(id)
                .then(Mono.just(new ResponseEntity<Void>(HttpStatus.NO_CONTENT)))
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }
}

