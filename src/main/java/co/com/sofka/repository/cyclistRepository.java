package co.com.sofka.repository;

import co.com.sofka.model.cyclistModel;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface cyclistRepository extends ReactiveMongoRepository<cyclistModel, String>{
}
