package com.ganadoplus.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ganadoplus.entity.Animal;

@Repository
public interface AnimalRepository extends CrudRepository<Animal, Long> {
	
	Animal save(Animal animal);
	List<Animal> findAll();
	
}
