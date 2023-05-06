package com.ganadoplus.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "animales")
public class Animal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "peso_inicial")
	private Double pesoInicial;
	
	@Column(name = "raza")
	private String raza;
	
	@Column(name = "estado_salud")
	private String estadoSalud;
	
	@Column(name = "nivel_produccion")
	private String nivelProduccion;
	
	@ManyToOne
	@JoinColumn(name = "tipo_animal_id")
	private TipoAnimal tipoAnimal;

	public Animal() {
		
	}
	
	public Long getId() {
		return this.id;
	}
	
	public void setId(String nombre) {
		this.nombre = nombre;
	}
	
	
	

	
	
	
	
	
	
}
