package co.com.sofka.repository;

import co.com.sofka.model.TeamModel;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends ReactiveMongoRepository<TeamModel, String> {
}
