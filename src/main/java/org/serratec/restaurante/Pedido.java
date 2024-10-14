package org.serratec.restaurante;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
//	@Enumerated(EnumType.STRING)
//	private PratoNome pratoNome;
//	@Enumerated(EnumType.STRING)
//	private Descricao descricaoPrato;
//	private int quantidade;
//	private double valor;
	
}
