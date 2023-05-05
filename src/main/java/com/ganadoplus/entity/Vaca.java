package com.ganadoplus.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "caracteristicas_fisicas_vaca")
public class Vaca {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "peso")
    private Double peso;

    @Column(name = "altura")
    private Double altura;

    @Column(name = "longitud_cuerpo")
    private Double longitudCuerpo;

    @Column(name = "circunferencia_pecho")
    private Double circunferenciaPecho;
    
    public Vaca() {
    	
    }

	public Vaca(Long id, Double peso, Double altura, Double longitudCuerpo, Double circunferenciaPecho) {
		super();
		this.id = id;
		
		this.peso = peso;
		this.altura = altura;
		this.longitudCuerpo = longitudCuerpo;
		this.circunferenciaPecho = circunferenciaPecho;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getLongitudCuerpo() {
		return longitudCuerpo;
	}

	public void setLongitudCuerpo(Double longitudCuerpo) {
		this.longitudCuerpo = longitudCuerpo;
	}

	public Double getCircunferenciaPecho() {
		return circunferenciaPecho;
	}

	public void setCircunferenciaPecho(Double circunferenciaPecho) {
		this.circunferenciaPecho = circunferenciaPecho;
	}

	@Override
	public String toString() {
		return "Vaca [id=" + id + ", peso=" + peso + ", altura=" + altura + ", longitudCuerpo=" + longitudCuerpo
				+ ", circunferenciaPecho=" + circunferenciaPecho + "]";
	}
    
}
