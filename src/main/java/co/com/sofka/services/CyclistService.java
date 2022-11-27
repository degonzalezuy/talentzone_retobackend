package co.com.sofka.services;

import co.com.sofka.repository.CyclistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CyclistService {

    @Autowired
    private CyclistRepository repo;

}
