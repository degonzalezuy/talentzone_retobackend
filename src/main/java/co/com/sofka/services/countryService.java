package co.com.sofka.services;

import co.com.sofka.repository.countryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class countryService {

    @Autowired
    private countryRepository repo;

}
