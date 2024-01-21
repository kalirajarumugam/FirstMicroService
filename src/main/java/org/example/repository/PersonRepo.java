package org.example.repository;

import org.example.entity.Persons;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Persons, Integer> {

}
