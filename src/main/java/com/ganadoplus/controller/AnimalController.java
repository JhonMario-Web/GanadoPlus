package com.ganadoplus.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ganadoplus.entity.Animal;
import com.ganadoplus.service.AnimalService;

@RestController
@CrossOrigin("*")
@RequestMapping("ganado-plus/api/v1/animal")
public class AnimalController {
	
	//GET === OBTENER INFORMACION
	//POST === ENVIAR INFORMACION NUEVA
	//PUT === ACTUALIZAR INFORMACION
	//DELETE === ELIMINAR INFORMACION
	// GET || http://localhost:8200/ganado-plus/api/v1/animal/
	
	@Autowired
	private AnimalService animalService;
	
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
	
	@PostMapping("/")
	public ResponseEntity<?> save(@RequestBody Animal animal) {
		Animal animalGuardado = null;
		
		try {
			animalGuardado = animalService.save(animal);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
		
		return ResponseEntity.ok(animalGuardado);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable Long id) {
		Animal animal = null;
		
		try {
			animal = animalService.findById(id);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
		
		return ResponseEntity.ok(animal);
	}

}
