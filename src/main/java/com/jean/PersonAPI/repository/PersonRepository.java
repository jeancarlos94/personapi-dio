package com.jean.PersonAPI.repository;

import com.jean.PersonAPI.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
