package com.ganadoplus.service;

import java.util.List;

import com.ganadoplus.entity.Animal;

public interface AnimalService {
	
	//(encap)(retorno-TOME)(nombre)(parametros-DAME)
	
	//METODO PARA CONSULTAR TODOS LOS ANIMALES EN LA TABLA DE "ANIMALES"
	//QUE ME RETORNE LA LISTA DE ANIMALES QUE ENCONTRO
	//QUE EL METODO SE LLAME findAll
	//QUE NO ME RECIBA NADA
	public List<Animal> findAll(); 
	
	//METODO PARA HACER INSERT EN LA TABLA DE "ANIMALES"
	//QUE ME RETORNE EL ANIMAL QUE YA GUARDO
	//QUE EL METODO SE LLAME save
	//QUE ME RECIBA EL ANIMAL QUE QUIERO GUARDAR
	public Animal save(Animal animal);
	
	//METODO PARA HACER UPDATE EN LA TABLA DE "ANIMALES"
	//QUE ME RETORNE EL ANIMAL QUE YA ACTUALICE
	//QUE EL METODO SE LLAME update
	//QUE ME RECIBA EL ANIMAL QUE QUIERO ACTUALIZAR
	public Animal update(Animal animal);
	
	//METODO PARA HACER UNA CONSULTA CON EL ID EN LA TABLA DE "ANIMALES"
	//QUE ME RETORNE EL ANIMAL QUE ENCONTRE
	//QUE EL METODO SE LLAME findById
	//QUE ME RECIBA EL ID DEL ANIMAL A CONSULTAR
	public Animal findById(Long id);

	//METODO PARA HACER UNA ELIMINACION CON EL ID EN LA TABLA DE "ANIMALES"
	//QUE NO ME RETORNE NADA
	//QUE SE LLAME deleteById
	//QUE ME RECIBA EL ID DEL ANIMAL A ELIMINAR
	public void deleteById(Long id);
	
}
