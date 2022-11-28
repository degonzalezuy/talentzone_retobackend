package co.com.sofka.controller;

import co.com.sofka.dto.CyclistDto;
import co.com.sofka.dto.TeamDto;
import co.com.sofka.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/teams")
public class TeamController {

    @Autowired
    private TeamService service;

    @GetMapping("/{id}")
    public ResponseEntity<Mono<TeamDto>> findTeamById(@PathVariable(value="id")String id){
        return ResponseEntity.ok().body(service.findTeamById(id));
    }

    @GetMapping("/cyclists/{id}")
    public ResponseEntity<Flux<CyclistDto>> findCyclists(@PathVariable("id")String id){
        return ResponseEntity.ok().body(service.findCyclists(id));
    }

    @PostMapping
    public ResponseEntity<Mono<TeamDto>>save(@RequestBody TeamDto teamDto){
        return ResponseEntity.ok().body(service.save(teamDto));
    }

    @PutMapping("/addCyclist/{teamId}/{cyclistId}")
    public ResponseEntity<Mono<TeamDto>> addCyclistToTeam(@PathVariable("id") String id, @PathVariable("idCyclist")String idCyclist){
        return ResponseEntity.ok().body(service.addCyclistToTeam(id, idCyclist));
    }

    @DeleteMapping("/{id}")
    public Mono<ResponseEntity<Void>> delete(@PathVariable("id") String id){
        return service.delete(id)
                .then(Mono.just(new ResponseEntity<Void>(HttpStatus.NO_CONTENT)))
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

}
