package br.com.erudio.Rest_With_Spring_Boot_And_Java_Erudio.controllers;

import br.com.erudio.Rest_With_Spring_Boot_And_Java_Erudio.PersonServices;
import br.com.erudio.Rest_With_Spring_Boot_And_Java_Erudio.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonServices service;

    //http://localhost:8080/person - endpoint utilizado como exemplo
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> findAll(){
        return service.findAll();
    }

    //http://localhost:8080/person/1 - endpoint utilizado como exemplo
    @GetMapping(value = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Person findById(@PathVariable("id") Long id){
        return service.findById(id);
    }

    //http://localhost:8080/person - Utilizado como exemplo na ferramenta Postman(Verbo HTTP - POST), passando como parametro no body o Json gerado no GET
    @PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Person create(@RequestBody Person person){
        return service.create(person);
    }

    //http://localhost:8080/person - Utilizado como exemplo na ferramenta Postman(Verbo HTTP - PUT), passando como parametro no body o Json gerado no GET
    @PutMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Person update(@RequestBody Person person){
        return service.create(person);
    }

    //http://localhost:8080/person/1 - - Utilizado como exemplo na ferramenta Postman(Verbo HTTP - DELETE), passando como parametro na URL o ID que desejo deletar
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }


}
