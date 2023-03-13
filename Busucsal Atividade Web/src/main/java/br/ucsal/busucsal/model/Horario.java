package br.ucsal.busucsal.model;

import java.time.LocalTime;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "horarios")

public class Horario {
	
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;
	


	private LocalTime hora;
	
	private String dia;
	
	private String roteiro;
	
	
	
	
	


	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getRoteiro() {
		return roteiro;
	}

	public void setRoteiro(String roteiro) {
		this.roteiro = roteiro;
	}
	
	
	
}
