package com.ganadoplus.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ganadoplus.entity.Animal;
import com.ganadoplus.repository.AnimalRepository;

@RestController
@RequestMapping("ganado-plus/api/v1/animal")
public class AnimalController {
	
	
	@Autowired
	private AnimalRepository animalService;
	
	@GetMapping("/")
	public ResponseEntity<?> findAll() {
		List<Animal> animales = new ArrayList<>(); 
		
		try {
			animales = animalService.findAll();
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
		
		return ResponseEntity.ok(animales);
	}
}
