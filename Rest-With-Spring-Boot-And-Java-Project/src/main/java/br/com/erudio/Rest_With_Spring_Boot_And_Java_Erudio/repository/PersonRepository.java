package br.com.erudio.Rest_With_Spring_Boot_And_Java_Erudio.repository;

import br.com.erudio.Rest_With_Spring_Boot_And_Java_Erudio.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
