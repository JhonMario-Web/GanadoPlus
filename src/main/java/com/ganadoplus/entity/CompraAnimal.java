package com.ganadoplus.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "compra_animal ")
public class CompraAnimal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "comprador_id")
	private Integer compradorId;
	
	@Column(name ="fecha_compra")
	private Date fechaCompra;
	
	@Column(name = "precion")
	private Double precion;
	
	@Column(name = "animal_id")
	private Integer animalId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCompradorId() {
		return compradorId;
	}

	public void setCompradorId(Integer compradorId) {
		this.compradorId = compradorId;
	}

	public Date getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public Double getPrecion() {
		return precion;
	}

	public void setPrecion(Double precion) {
		this.precion = precion;
	}

	public Integer getAnimalId() {
		return animalId;
	}

	public void setAnimalId(Integer animalId) {
		this.animalId = animalId;
	}

	@Override
	public String toString() {
		return "CompraAnimal [id=" + id + ", compradorId=" + compradorId + ", fechaCompra=" + fechaCompra + ", precion="
				+ precion + ", animalId=" + animalId + "]";
	}

}
