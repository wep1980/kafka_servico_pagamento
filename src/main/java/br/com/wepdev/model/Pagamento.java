package br.com.wepdev.model;

import java.io.Serializable;

import lombok.Getter;

@Getter
public class Pagamento implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Long idUsuario;
	private Long idProduto;
	private String numeroCartao;

}
