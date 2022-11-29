package co.com.sofka;

import co.com.sofka.model.CountryModel;
import co.com.sofka.repository.CountryRepository;
import com.mongodb.internal.VisibleForTesting;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.TextScore;
import org.junit.jupiter.api.Test;


//@ExtendWith(MockitoExtension.class)
class CountryServiceTest {
    @Autowired
    private CountryRepository repo;

 /*   @Test
    void countryExist(){
        CountryModel countryModel = new CountryModel("1", "Paysandú", "PDU");
        repo.save(countryModel);
        Boolean actualResult = repo.existsById("1");

    }*/
}
