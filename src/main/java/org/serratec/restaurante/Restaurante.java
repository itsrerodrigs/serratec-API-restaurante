package org.serratec.restaurante;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Restaurante {

	@Autowired
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeRestaurante;
	private String enderecoRestaurante;
	@Enumerated(EnumType.STRING)
	private PratoNome pratoNome;
	@Enumerated(EnumType.STRING)
	private Descricao descricaoPrato;
	private int quantidade;
	private double valor;
	
	
	public PratoNome getPratoNome() {
		return pratoNome;
	}
	public void setPratoNome(PratoNome pratoNome) {
		this.pratoNome = pratoNome;
	}
	public Descricao getDescricaoPrato() {
		return descricaoPrato;
	}
	public void setDescricaoPrato(Descricao descricaoPrato) {
		this.descricaoPrato = descricaoPrato;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeRestaurante() {
		return nomeRestaurante;
	}
	public void setNomeRestaurante(String nomeRestaurante) {
		this.nomeRestaurante = nomeRestaurante;
	}
	public String getEnderecoRestaurante() {
		return enderecoRestaurante;
	}
	public void setEnderecoRestaurante(String enderecoRestaurante) {
		this.enderecoRestaurante = enderecoRestaurante;
	}
	
	
}
 