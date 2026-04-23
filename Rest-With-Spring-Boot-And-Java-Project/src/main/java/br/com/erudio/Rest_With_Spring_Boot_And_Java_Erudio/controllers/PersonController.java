package br.com.erudio.Rest_With_Spring_Boot_And_Java_Erudio.controllers;

import br.com.erudio.Rest_With_Spring_Boot_And_Java_Erudio.PersonServices;
import br.com.erudio.Rest_With_Spring_Boot_And_Java_Erudio.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonServices service;

    //http://localhost:8080/person - endpoint utilizado como exemplo
    @RequestMapping(method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Person> findAll(){
        return service.findAll();
    }

    //http://localhost:8080/person/1 - endpoint utilizado como exemplo
    @RequestMapping(value = "/{id}",
        method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Person findById(@PathVariable("id") String id){
        return service.findById(id);
    }

    //http://localhost:8080/person - Utilizado como exemplo na ferramenta Postman(Verbo HTTP - POST), passando como parametro no body o Json gerado no GET
    @RequestMapping(
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Person create(@RequestBody Person person){
        return service.create(person);
    }

    //http://localhost:8080/person - Utilizado como exemplo na ferramenta Postman(Verbo HTTP - PUT), passando como parametro no body o Json gerado no GET
    @RequestMapping(
            method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Person update(@RequestBody Person person){
        return service.create(person);
    }

    //http://localhost:8080/person/1 - - Utilizado como exemplo na ferramenta Postman(Verbo HTTP - DELETE), passando como parametro na URL o ID que desejo deletar
    @RequestMapping(value = "/{id}",
            method = RequestMethod.DELETE
    )
    public void delete(@PathVariable("id") String id){
        service.delete(id);
    }


}
