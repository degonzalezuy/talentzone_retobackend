package co.com.sofka.services;

import co.com.sofka.repository.teamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class teamService {

    @Autowired
    private teamRepository repo;

}
