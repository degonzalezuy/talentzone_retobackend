package co.com.sofka.repository;

import co.com.sofka.model.CyclistModel;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CyclistRepository extends ReactiveMongoRepository<CyclistModel, String>{
}
