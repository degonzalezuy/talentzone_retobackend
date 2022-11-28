package co.com.sofka.services;

import co.com.sofka.dto.CyclistDto;
import co.com.sofka.dto.TeamDto;
import co.com.sofka.interfaces.ITeam;
import co.com.sofka.model.TeamModel;
import co.com.sofka.repository.CyclistRepository;
import co.com.sofka.repository.TeamRepository;
import co.com.sofka.utils.AppUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TeamService implements ITeam {

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private CyclistRepository cyclistRepository;
    @Override
    public Mono<TeamDto> findTeamById(String id) {
        return teamRepository.findById(id).map(AppUtils::teamModelToDto);
    }

    @Override
    public Mono<TeamDto> save(TeamDto teamDto) {
        TeamModel teamModel = AppUtils.teamDtoToModel(teamDto);
        return teamRepository.save(teamModel)
                .map(AppUtils::teamModelToDto);
    }
    @Override
    public Flux<CyclistDto> findCyclists(String teamId) {
        return teamRepository.findAll()
                .filter(teamModel -> teamModel.getId().equals(teamId))
                .flatMapIterable(TeamModel::getCyclists)
                .map(AppUtils::cyclistModelToDto);
    }

    @Override
    public Mono<TeamDto> addCyclistToTeam(String teamId, String cyclistId){
        return teamRepository.findById(teamId)
                .flatMap(teamModel -> {
                    if (teamModel.getCyclists().size() < 8) {
                        return cyclistRepository.findById(cyclistId)
                                .flatMap(cyclistModel -> {
                                    teamModel.getCyclists().add(cyclistModel);
                                    return teamRepository.save(teamModel);
                                });
                    }
                    return Mono.just(teamModel);
                }).map(AppUtils::teamModelToDto);
    }

    @Override
    public Mono<Void> delete(String id) {
        return teamRepository
                .findById(id)
                .flatMap(teamModel -> teamRepository.deleteById(teamModel.getId()))
                .switchIfEmpty(Mono.empty());
    }
    @Override
    public Mono<TeamDto> update(TeamDto teamDto, String id){
        return teamRepository.findById(id)
                .flatMap(teamModel -> {
                    TeamModel teamModel1 = AppUtils.teamDtoToModel(teamDto);
                    teamModel1.setId(id);
                    return teamRepository.save(teamModel1);
                })
                .map(AppUtils::teamModelToDto)
                .switchIfEmpty(Mono.empty());
    }
}
