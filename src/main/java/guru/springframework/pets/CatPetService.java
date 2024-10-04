package guru.springframework.pets;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/28/19.
 */

@Profile("cat")
@Service
public class CatPetService implements PetService {
    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}