package com.ganadoplus.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ganadoplus.entity.Animal;
import com.ganadoplus.repository.AnimalRepository;
import com.ganadoplus.service.AnimalService;

@Service
public class AnimalServiceImp implements AnimalService {
	
	@Autowired
	private AnimalRepository animalRepository;

	@Override
	public List<Animal> findAll() {
		return animalRepository.findAll();
	}

	@Override
	public Animal save(Animal animal) {
		return animalRepository.save(animal);
	}

	@Override
	public Animal update(Animal animal) {
		return animalRepository.update(animal);
	}

	@Override
	public Animal findById(Long id) {
		return animalRepository.findById(id).orElse(null);
	}

	@Override
	public void deleteById(Long id) {
		animalRepository.deleteById(id);
	}

}
