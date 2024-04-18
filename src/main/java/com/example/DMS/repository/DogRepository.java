package com.example.DMS.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.DMS.Models.Dog;

@Repository
public interface DogRepository extends CrudRepository<Dog,Integer>{

}
