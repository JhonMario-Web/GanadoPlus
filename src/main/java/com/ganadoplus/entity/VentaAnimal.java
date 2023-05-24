package com.ganadoplus.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "venta_animal")
public class VentaAnimal {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "fecha_venta")
	private Date fechaVenta;
	
	@Column(name = "animal_id")
	private Integer animalId;
	
	@Column(name = "comprador_id")
	private Integer compradorId;
	
	@Column(name = "vendedor_id")
	private Integer vendedorId;
	
	@Column(name = "precio")
	private Double precio;
	
	@Column(name = "tipo_venta")
	private String tipoVenta;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public Integer getAnimalId() {
		return animalId;
	}

	public void setAnimalId(Integer animalId) {
		this.animalId = animalId;
	}

	public Integer getCompradorId() {
		return compradorId;
	}

	public void setCompradorId(Integer compradorId) {
		this.compradorId = compradorId;
	}

	public Integer getVendedorId() {
		return vendedorId;
	}

	public void setVendedorId(Integer vendedorId) {
		this.vendedorId = vendedorId;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getTipoVenta() {
		return tipoVenta;
	}

	public void setTipoVenta(String tipoVenta) {
		this.tipoVenta = tipoVenta;
	}

	@Override
	public String toString() {
		return "VentaAnimal [id=" + id + ", fechaVenta=" + fechaVenta + ", animalId=" + animalId + ", compradorId="
				+ compradorId + ", vendedorId=" + vendedorId + ", precio=" + precio + ", tipoVenta=" + tipoVenta + "]";
	}
	

}
