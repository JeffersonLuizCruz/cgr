package com.cgr.services.impl;

import java.util.StringTokenizer;

import com.cgr.services.ValidacaoStrategy;

public class Gerente implements ValidacaoStrategy{
	
	private  String gerente = "Severino de Oliveira Silva";

	@Override
	public String primeiroNome(String nome) {
		if(gerente!= nome || gerente.trim().length() < nome.length())
			return String.format("\n Erro de Validação no campo Nome");
		
		StringTokenizer st = new StringTokenizer(nome);
		
			 return String.format("\n Primeiro Nome: " + st.nextToken(" "));
	}


	@Override
	public String sobreNome(String nome) {
		if(gerente != nome || gerente.trim().length() < nome.length())
			return String.format("\n Erro de Validação no campo Nome");
		
		gerente = nome.split(" ")[nome.split(" ").length - 2];
		return String.format("\n Sobrenome: %s", gerente);
	}
	
	@Override
	public String nomeLetraMaiuscula(String nome) {
		
		String maiuscula = nome.toUpperCase();
		return maiuscula;
	}


	@Override
	public String nomeAbreviado(String nome) {
		
		String[] nomeabreviado = nome.split(" ");
		String nomesobrenome = nomeabreviado[0] + " " +nomeabreviado[nomeabreviado.length -1];
		
		return nomesobrenome;
		
	}


}
