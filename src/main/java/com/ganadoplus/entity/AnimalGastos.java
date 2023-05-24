package com.ganadoplus.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "animal_gastos")
public class AnimalGastos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "animal_id")
	private Integer animalId;
	
	@Column(name = "tipo_gasto")
	private String tipoGasto;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "fecha")
	private Date fecha;
	
	@Column(name = "costo")
	private Double costo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getAnimalId() {
		return animalId;
	}

	public void setAnimalId(Integer animalId) {
		this.animalId = animalId;
	}

	public String getTipoGasto() {
		return tipoGasto;
	}

	public void setTipoGasto(String tipoGasto) {
		this.tipoGasto = tipoGasto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Double getCosto() {
		return costo;
	}

	public void setCosto(Double costo) {
		this.costo = costo;
	}

	@Override
	public String toString() {
		return "AnimalGastos [id=" + id + ", animalId=" + animalId + ", tipoGasto=" + tipoGasto + ", descripcion="
				+ descripcion + ", fecha=" + fecha + ", costo=" + costo + "]";
	}

}
