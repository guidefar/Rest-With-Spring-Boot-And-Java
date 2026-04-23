package br.com.erudio.Rest_With_Spring_Boot_And_Java_Erudio;

import br.com.erudio.Rest_With_Spring_Boot_And_Java_Erudio.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();//Gerando ID automaticamente
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public List<Person> findAll(){

        logger.info("Finding all people!");

        List<Person> persons = new ArrayList<Person>();
        for(int i = 0; i < 8;i++){
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }
    ;
    public Person findById(String id){
        logger.info("Finding one Person!");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Guilherme");
        person.setLastName("Augusto");
        person.setAddress("Pouso Alegre - MG");
        person.setGender("Male");
        return person;
    }

    private Person mockPerson(int i) {

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("FirstName" + i);
        person.setLastName("LastName" + i);
        person.setAddress("Some address in Brazil");
        person.setGender("Male");
        return person;
    }

    public Person create(Person person){

        logger.info("Create one person!");
        return person;
    }

    public Person update(Person person){

        logger.info("Updating one person!");
        return person;
    }

    public void  delete(String id){

        logger.info("Deleting one person!");
    }
}
