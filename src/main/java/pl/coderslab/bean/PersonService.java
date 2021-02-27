package pl.coderslab.bean;

import org.springframework.stereotype.Component;

@Component
public class PersonService {
    private PersonRepository personRepo;


    public PersonRepository getPersonRepo() {
        return personRepo;
    }
    public PersonService(PersonRepository personRepo) {
        this.personRepo = personRepo;
    }
}
