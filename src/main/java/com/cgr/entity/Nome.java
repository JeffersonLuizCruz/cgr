package com.cgr.entity;

import java.io.Serializable;

import com.cgr.services.ValidacaoStrategy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class Nome implements Serializable{
	private static final long serialVersionUID = 1L;

	private ValidacaoStrategy validacao;
	
	private String nome;
	private String resultNome;
	
	public void validarPrimeiroNome() {
		this.resultNome = validacao.validarPrimeiroNome(nome);
	}
	
	public void validarSobreNome() {
		this.resultNome = validacao.sobreNome(nome);
	}
	
	public void validarParaMaiuscula() {
		this.resultNome = validacao.nomeLetraMaiuscula(nome);
	}
	
	public void validarNomeAbreviado() {
		this.resultNome = validacao.nomeAbreviado(nome);
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n\n\n\nNome: ");
		builder.append(getNome());
		builder.append("\nDetalhes:\n");
		builder.append(getResultNome());
		return builder.toString();
	
	}

}
