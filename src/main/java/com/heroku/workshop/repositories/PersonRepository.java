package com.heroku.workshop.repositories;
 
import java.util.List;
import com.heroku.workshop.entities.Person;
 
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
 
@RepositoryRestResource
public interface PersonRepository extends CrudRepository<Person, Long> {
 
}