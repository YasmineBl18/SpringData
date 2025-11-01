package org.example.springdatatp1.repository;

import org.example.springdatatp1.model.Centre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path="students")

public interface CentreRepository extends JpaRepository<Centre, Long> {

}