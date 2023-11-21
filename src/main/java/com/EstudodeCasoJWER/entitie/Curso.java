package com.EstudodeCasoJWER.entitie;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "curso")
public class Curso {
	@Id
	@GeneratedValue
	
	(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "cargaHoraria")
	private Double cargaHoraria;
	
	@Column(name = "conteudoProgramatico")
	private String conteudoProgramatico;
	
	@Column(name = "valor")
	private double valor;
	
	@Column(name = "professor")
	private String professor;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome(){
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getcargaHoraria() {
		return cargaHoraria;
	}
	public void setcargaHoraria(Double cargaHoraria) {
		this.cargaHoraria= cargaHoraria;
	}
	public String getconteudoProgramatico(){
		return conteudoProgramatico;
	}
	public void setconteudoProgramatico(String conteudoProgramatico) {
		this.conteudoProgramatico = conteudoProgramatico;
	}
	public double getValor(){
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getProfessor(){
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}

}
