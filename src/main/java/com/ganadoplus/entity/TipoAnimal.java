package com.ganadoplus.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_animal")
public class TipoAnimal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "tipo")
	private String tipo;
	
	public TipoAnimal () {
		
	}
	
	public Long getId() {
		return this.id;
	}
	
	public String getTipo() {
		return this.tipo; 
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;	
	}
	
}
