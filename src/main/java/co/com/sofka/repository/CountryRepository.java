package co.com.sofka.repository;

import co.com.sofka.model.CountryModel;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CountryRepository extends ReactiveMongoRepository<CountryModel, String> {
}
