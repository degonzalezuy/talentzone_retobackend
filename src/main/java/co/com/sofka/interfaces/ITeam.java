package co.com.sofka.interfaces;

import co.com.sofka.dto.CyclistDto;
import co.com.sofka.dto.TeamDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ITeam {
    public Mono<TeamDto> findTeamById(String id);
    public Mono<TeamDto> save(TeamDto teamDto);
    public Flux<CyclistDto> findCyclists(String teamId);
    public Mono<TeamDto> addCyclistToTeam(String teamId, String cyclistId);
    public Mono<Void> delete(String id);
    public Mono<TeamDto> update(TeamDto teamDto, String id);
}
