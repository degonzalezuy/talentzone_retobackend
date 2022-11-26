package co.com.sofka.repository;

import co.com.sofka.model.countryModel;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface countryRepository extends ReactiveMongoRepository<countryModel, String> {
}
