package com.ganadoplus.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "historial_medico")
public class HistorialMedico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "fecha")
	private Date fecha;
	
	@Column(name = "enfermedad")
	private String enfermedad;
	
	@Column(name = "tratamiento")
	private String tratamiento;
	
	@Column(name = "animal_id")
	private Integer animalId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	public Integer getAnimalId() {
		return animalId;
	}

	public void setAnimalId(Integer animalId) {
		this.animalId = animalId;
	}

	@Override
	public String toString() {
		return "HistorialMedico [id=" + id + ", fecha=" + fecha + ", enfermedad=" + enfermedad + ", tratamiento="
				+ tratamiento + ", animalId=" + animalId + "]";
	}

}
