package com.ganadoplus.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ganadoplus.entity.Animal;

@Repository
public interface AnimalRepository extends CrudRepository<Animal, Long> {

  //(encap)(retorno-TOME)(nombre)(parametros-DAME)
	public List<Animal> findAll();
	
	//METODO PARA HACER INSERT EN LA TABLA DE "ANIMALES"
	public Animal save(Animal animal);
	
	//METODO PARA HACER UPDATE EN LA TABLA DE "ANIMALES"
	//QUE ME RECIBA EL ANIMAL QUE QUIERO ACTUALIZAR
	//QUE ME RETORNE EL ANIMAL QUE YA ACTUALICE
	public Animal update(Animal animal);
	
	//METODO PARA HACER UNA ELIMINACION CON EL ID EN LA TABLA DE "ANIMALES"
	//QUE NO ME RETORNE NADA
	//QUE SE LLAME deleteById
	//QUE ME RECIBA EL ID DEL ANIMAL A ELIMINAR
	public void deleteById(Long id);
	
	
}
