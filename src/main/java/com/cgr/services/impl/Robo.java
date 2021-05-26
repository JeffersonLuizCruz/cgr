package com.cgr.services.impl;

import java.util.StringTokenizer;

import com.cgr.services.ValidacaoStrategy;

public class Robo implements ValidacaoStrategy{
	
	private  String robo = "Juliana Pires Silva";

	@Override
	public String validarPrimeiroNome(String nome) {
		if(robo!= nome || robo.trim().length() < nome.length())
			return String.format("\n Erro de Validação no campo Nome");
		
		StringTokenizer st = new StringTokenizer(nome);
		
			 return String.format("\n Primeiro Nome: " + st.nextToken(" "));
	}

	@Override
	public String sobreNome(String nome) {
		if(robo != nome || robo.trim().length() < nome.length())
			return String.format("\n Erro de Validação no campo Nome");
		
		robo = nome.split(" ")[nome.split(" ").length - 2];
		return String.format("\n Sobrenome: %s", robo);
	}
	
	@Override
	public String nomeLetraMaiuscula(String nome) {
		
		String maiuscula = nome.toUpperCase();
		return maiuscula;
	}

	@Override
	public String nomeAbreviado(String nome) {
		// TODO Auto-generated method stub
		return null;
	}



}
