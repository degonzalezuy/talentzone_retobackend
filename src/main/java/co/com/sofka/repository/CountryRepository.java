package co.com.sofka.repository;

import co.com.sofka.model.CountryModel;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CountryRepository extends ReactiveMongoRepository<CountryModel, String> {
}
