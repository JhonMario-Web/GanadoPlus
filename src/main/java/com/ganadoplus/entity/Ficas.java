package com.ganadoplus.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ficas")
public class Ficas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "ciudad")
	private String ciudad;
	
	@Column(name = "departamento")
	private String departatmento;
	
	@Column(name = "pais")
	private String pais;
	
	@Column(name = "area")
	private Double area;
	
	@Column(name = " tipo_terreno")
	private String tipoTerreno;
	
	@Column(name = "fecha_compra")
	private Date fechaCompra;
	
	@Column(name = "valor_compra")
	private Double valorCompra;
	
	@Column(name = "fecha_venta")
	private Date fechaVenta;
	
	@Column(name = "valor_venta")
	private Double valorVenta;
	
	@Column(name = "propietario_id")
	private Integer propietarioId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDepartatmento() {
		return departatmento;
	}

	public void setDepartatmento(String departatmento) {
		this.departatmento = departatmento;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public String getTipoTerreno() {
		return tipoTerreno;
	}

	public void setTipoTerreno(String tipoTerreno) {
		this.tipoTerreno = tipoTerreno;
	}

	public Date getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public Double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(Double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public Date getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public Double getValorVenta() {
		return valorVenta;
	}

	public void setValorVenta(Double valorVenta) {
		this.valorVenta = valorVenta;
	}

	public Integer getPropietarioId() {
		return propietarioId;
	}

	public void setPropietarioId(Integer propietarioId) {
		this.propietarioId = propietarioId;
	}

	@Override
	public String toString() {
		return "Ficas [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", ciudad=" + ciudad
				+ ", departatmento=" + departatmento + ", pais=" + pais + ", area=" + area + ", tipoTerreno="
				+ tipoTerreno + ", fechaCompra=" + fechaCompra + ", valorCompra=" + valorCompra + ", fechaVenta="
				+ fechaVenta + ", valorVenta=" + valorVenta + ", propietarioId=" + propietarioId + "]";
	}
	

}
