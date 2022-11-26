package co.com.sofka.services;

import co.com.sofka.repository.cyclistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class cyclistService {

    @Autowired
    private cyclistRepository repo;

}
