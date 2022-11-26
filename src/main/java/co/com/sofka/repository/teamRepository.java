package co.com.sofka.repository;

import co.com.sofka.model.teamModel;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface teamRepository extends ReactiveMongoRepository<teamModel, String> {
}
